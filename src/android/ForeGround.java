package cordova.plugin.foreground;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.Activity;

/**
 * This class echoes a string called from JavaScript.
 */
public class ForeGround extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            
            this.coolMethod( callbackContext);
            return true;
        }
        return false;
    }

    private void coolMethod( CallbackContext callbackContext) {
        cordova.getActivity().startService(new Intent(cordova.getActivity(), MyService.class));
       
    }
}
