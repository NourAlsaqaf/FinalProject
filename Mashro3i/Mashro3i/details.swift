//
//  details.swift
//  Mashro3i
//
//  Created by Nour on 4/2/22.
//

import SwiftUI

struct details: View {

    var mashs : mashS
  //  let backgroundGradient =
    var body: some View {
        ZStack{
            
            LinearGradient(
                gradient: Gradient(colors: [mashs.colors[0], mashs.colors[1]]),
                startPoint: .top, endPoint: .bottom)
                            .ignoresSafeArea()
//            Color.blue
//                .ignoresSafeArea()
        VStack{
            Image(mashs.name)
                .resizable()
                .scaledToFill()
                .frame(width: 200, height: 200)
                .clipShape(Circle())
            
            Text(mashs.name)
                .font(.largeTitle)
                .foregroundColor(Color.white)
                .multilineTextAlignment(.center)
                .font(.custom("Raleway-VariableFont_wght", size: 40))
            
            Text(mashs.description)
                .foregroundColor(Color.white)
                .multilineTextAlignment(.center)
                .font(.title2)
            
            
        }
        }
    }
    }


struct details_Previews: PreviewProvider {
    @State static var color1 = Color.pink
    @State static var color2 = Color.orange
    static var previews: some View {
        details( mashs: Deserve)
    }
}
