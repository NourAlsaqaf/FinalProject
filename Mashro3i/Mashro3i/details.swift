//
//  details.swift
//  Mashro3i
//
//  Created by Nour on 4/2/22.
//

import SwiftUI
let backgroundGradient = LinearGradient(
    gradient: Gradient(colors: [Color.orange, Color.pink]),
    startPoint: .top, endPoint: .bottom)
struct details: View {
    var mashs : mashS
    var body: some View {
        ZStack{
            
            backgroundGradient
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
//                .bold()
            Text(mashs.description)
                .font(.title2)
                .foregroundColor(Color.white)
                .multilineTextAlignment(.center)
        }
        }
    }
    }


struct details_Previews: PreviewProvider {
    static var previews: some View {
        details(mashs: candyshop)
    }
}
