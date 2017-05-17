$(document).ready(function()
{
   $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:4567/availableGates",
        success: function(data){  
                
                for (i = 0; i < data.length; i++) {
                    $('#mySelect').append('<option value="' + data[i] + '">' + data[i] + '</option>');
                } 
             }
    
    });
//loadMap();
});

function choose()
{
var selected  = $('#mySelect').find(":selected").val();
    $.ajax({
        type: 'POST',        
        url: "http://localhost:4567/gate",
        data: { 
            'number': selected            
        },
        success: function(msg){
            alert('gate ' + selected + ' is selected ' );
        },
error: function(msg)
{  
alert('gate ' + selected + ' is occupied so cannot be selected now');
}
    });
}

function free()
{
var selected  = $('#mySelect').find(":selected").val();
    $.ajax({
        type: 'POST',        
        url: "http://localhost:4567/freeGate",
        data: { 
            'number': selected            
        },
        success: function(msg){
            alert('gate ' + selected + ' is free now');
        }

    });
}
function loadMap() {
        map = new OpenLayers.Map("map");
        var mapnik         = new OpenLayers.Layer.OSM();
        var fromProjection = new OpenLayers.Projection("EPSG:4326");   // Transform from WGS 1984
        var toProjection   = new OpenLayers.Projection("EPSG:900913"); // to Spherical Mercator Projection
        var position       = new OpenLayers.LonLat(13.41,52.52).transform( fromProjection, toProjection);
        var zoom           = 15; 

        map.addLayer(mapnik);
        map.setCenter(position, zoom );
      }
