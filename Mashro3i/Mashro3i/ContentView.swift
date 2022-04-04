//
//  ContentView.swift
//  Mashro3i
//
//  Created by Nour on 3/31/22.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
        

            List(mashSarry, id: \.id){ mash in
                NavigationLink(
                    destination: details(mashs: mash)){
                    
                    HStack{
                        Image(mash.name)
                            .resizable()
                            .scaledToFill()
                            .frame(width: 75, height: 75)
                            .clipShape(Circle())
                        Text(mash.name)
                            .font(.title3)
                            .foregroundColor(Color.black)
                            .bold()
                            
                                                    
                    }
                }
                
            
                
            }
            .navigationTitle("قائمة المشاريع")//.foregroundColor(.red)
            .font(/*@START_MENU_TOKEN@*/.title/*@END_MENU_TOKEN@*/)
            .foregroundColor(/*@START_MENU_TOKEN@*/Color("AccentColor")/*@END_MENU_TOKEN@*/)
        
           
            
            
            
            
            
            
            
            
            
            //.multilineTextAlignment(.center)
          //  Image("list")
//            background(Color.blue)
            
        }
        
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
struct mashS : Identifiable{
    var id = UUID()
    var name : String
    var accname : String
    var description : String
    
    
}

let mashs = ["Candy Shop" ,"Deserve" ,"EmbroidryF", "Haya Acsesories", "Nbracelets", "sah crafts", "sargovel", "ShMaker", "SOC", "Teeshirts Qoutes", "Taiba Threads", "Bracelets Kw", "Elencx", "Shinelineq8", "Candy Treats", "artkuwait2022" ]

var candyshop = mashS(name: "Candy Shop", accname: "Candy Shop", description: "candies")
var Deserve = mashS(name: "Deserve" , accname: "Acount Deserve Company", description: "شركة متخصصة في صناعة الحفلات والترفيه بأسلوب يحاكي الشغف و الإبداع، فلكل عميل متعة و مزاج خاص نسعى للوصول لشغف كل عميل بصورة مختلفة فيها من الإبداع والإبتكار والإهتمام بأدق التفاصيل.")
var EmbroidryF = mashS(name: "EmbroidryF", accname: "EmbroidryF", description: "hh")
var HayaAcsesories = mashS(name: "Haya Acsesories", accname: "Haya Acsesories", description: "Acsesories")
var Nbracelets = mashS(name: "Nbracelets", accname: "N.bracelets", description: "Handmade bracelets and Acsesories")
var sahcrafts = mashS(name: "sah crafts", accname: "", description: "")
var sargovel = mashS(name: "sargovel", accname: "sargovel", description: "")
var ShMaker = mashS(name: "ShMaker", accname: "ShMaker", description: "")
var SOC = mashS(name: "SOC", accname: "SOC", description: "SOC")
var TeeshirtsQoutes = mashS(name: "Teeshirts Qoutes", accname: "TeeshirtsQoutes", description: "")
var TaibaThreads = mashS(name: "Taiba Threads", accname: "TaibaThreads", description: "")
var BraceletsKw = mashS(name: "Bracelets Kw", accname: "", description: "")
var Elencx = mashS(name: "Elencx", accname: "Elencx", description: "")
var Shinelineq8 = mashS(name: "Shinelineq8", accname: "Shinelineq8", description: "")
var CandyTreats = mashS(name: "Candy Treats", accname: "Candy Treats", description: "")
var artkuwait2022 = mashS(name: "artkuwait2022", accname: "art.kuwait2022", description: "خلال مشروعنا نقدر نرسم على المبخر على حسب الطلب، نوفر توزيعات لكل المناسبات ومنها توزيعات للقرقيعان.")

var mashSarry = [
    candyshop , Deserve , EmbroidryF , HayaAcsesories , Nbracelets , sahcrafts , sargovel , ShMaker , SOC , TeeshirtsQoutes , TaibaThreads , BraceletsKw , Elencx , Shinelineq8 , CandyTreats , artkuwait2022 , 
]
