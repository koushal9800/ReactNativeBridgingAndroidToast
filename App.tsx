import React from "react";
import { View,Text, NativeModules, TouchableOpacity } from "react-native";

const App = () =>{

const ToastService = NativeModules.ToastModule

  return (
    <View style={{ justifyContent:'center', alignItems:'center', flex:1 }} >
      <TouchableOpacity 
      onPress={()=>ToastService.showToast("Bridging Success")}
      style={{
        padding:12, margin:20, backgroundColor:'red'
      }} >
        <Text style={{ color:'#fff' }} >Click to show Toast</Text>
      </TouchableOpacity>
    </View>
  )
}

export default App