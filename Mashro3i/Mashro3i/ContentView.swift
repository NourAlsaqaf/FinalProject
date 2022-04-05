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
                            .fontWeight(.bold)
                            .foregroundColor(Color.white)
                            .navigationTitle("✨قائمة المشاريع✨")
                        
                    }
                }
                .frame(width: 345 ,height: 90)
              
                .background(Color(red: 0.139, green: 0.369, blue: 0.605))
            }
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
    var colors: [Color]
    
}

let mashs = ["✨Candy Shop✨" ,"✨Deserve✨" ,"✨EmbroideryF✨", "✨Hya Accessories✨", "✨Nbracelets✨", "✨sah crafts✨", "✨sargovel✨", "✨ShMaker✨", "✨SOC✨", "✨Qoutes Teeshirts✨", "✨Taiba Threads✨", "✨Bracelets Kw✨", "✨Elencx✨", "✨Shinelineq8✨", "✨Candy Treats✨", "✨artkuwait2022✨","✨Palestine Ghorzah✨", "✨Fati Shop✨" ]

var candyshop = mashS(name: "✨Candy Shop✨", accname: "Candy Shop", description: "مشروع كاندي شوب لبوكسات الحلاو والقرقيعان.                                   ✨Instagram: @candyyshop.kw✨", colors: [Color.white,Color.pink])

var Deserve = mashS(name: "✨Deserve✨" , accname: "Acount Deserve Company", description: "شركة متخصصة في صناعة الحفلات والترفيه بأسلوب يحاكي الشغف و الإبداع، فلكل عميل متعة و مزاج خاص نسعى للوصول لشغف كل عميل بصورة مختلفة فيها من الإبداع والإبتكار والإهتمام بأدق التفاصيل.                           ✨Instagram: @deserve.official✨",colors:[Color.white,Color.blue])

var EmbroidryF = mashS(name: "✨EmbroideryF✨", accname: "EmbroidryF", description: "مشروع تطريز و حياكة على حسب الطلب لجميع المناسبات: مواليد، أعياد ميلاد، صور شخصية والعاب للأطفال بأسعار مناسبة.           ✨Instagram: @embroideryf ✨",colors: [Color.white,Color.pink])

var HyaAccessories = mashS(name: "✨Hya Accessories✨", accname: "", description: "إكسسوارات مصنوعة يدوية: أساور، سلاسل، إكسسوارات للشعر.                     ✨Instagram: @hyaccessoriess✨",colors: [Color.white,Color.purple])

var Nbracelets = mashS(name: "✨Nbracelets✨", accname: "N.bracelets", description: "مشروع لأساور الصداقة وأساور الخرز مصنوعة يدوياً.                                                  ✨Instagram: @N.braceletsq8✨",colors: [Color.white,Color.black])

var sahcrafts = mashS(name: "✨sah crafts✨", accname: "", description: "مشروع يصمم اشكال ومجسمات وميداليات واكسسوارات من الطين الحراري بصناعة يدوية.                                              ✨Instagram: @sah.crafts✨",colors: [Color.white,Color.blue])

var sargovel = mashS(name: "✨sargovel✨", accname: "sargovel", description: "مشروعنا لصناعة الإكسسوارات بالصلصال يدوياً.                                          ✨Instagram: @sangvoel✨",colors: [Color.white,Color.orange])

var ShMaker = mashS(name: "✨ShMaker✨", accname: "", description: "مشروع حلويات ومتميزين بكيكة جوز الهند اللذيذة.                                     ✨Instagram: @sh.maker✨",colors: [Color.white,Color.blue])

var SOC = mashS(name: "✨SOC✨", accname: "SOC", description: "فكرتنا ان نرسم على الاشياء ونعطيها لمسة فنية و هم نقدر نجدد شغلة مستهلكة عشان يعاد إستخدامها.                                              ✨Instagram: @soc.kw✨",colors: [Color.white,Color.orange])

var QoutesTeeshirts = mashS(name: "✨Qoutes Teeshirts✨", accname: "TeeshirtsQoutes", description: "كوتس تيشيرت: براند كويتي لطباعة التصاميم بجودة عالية على التيشيرتات والهوديات و أكثر.          ✨Instagram: @Qoutes_teeshirts✨",colors: [Color.white,Color.black])

var TaibaThreads = mashS(name: "✨Taiba Threads✨", accname: "TaibaThreads", description: "مشروعنا للكروشيه والصناعة اليدوية،نحب إضافة الكروشيه بكل شي ونحوله لقطعة فنية مميزة.                                                         ✨Instagram: @taibathreade✨",colors: [Color.white,Color.black])

var BraceletsKw = mashS(name: "✨Bracelets Kw✨", accname: "", description: ".مشروعنا للأساور وسلاسل الخرز والخيوط                                    ✨Instagram: @Bracelets._kw✨",colors: [Color.white,Color.blue])

var Elencx = mashS(name: "✨Elencx✨", accname: "Elencx", description:"أُطرز بالخيط حباً🧵                                            أؤمن أن ما اصنعه يخلق شيئاً من الفرح💕     لطلبات التطريز وجميع مستلزمات التطريز.                       ✨Instagram: @elencx✨",colors: [Color.pink,Color.white])
var Shinelineq8 = mashS(name: "✨Shinelineq8✨", accname: "Shinelineq8", description: "متجر مهتم بمنتجات لكل ما يخص المسلسلات والأفلام العالمية مثل : friends, harry potter وغيرهم.                                                    ✨Instagram: @shinelineq8✨",colors: [Color.white,Color.orange])

var CandyTreats = mashS(name: "✨Candy Treats✨", accname: "Candy Treats", description: "مشروعنا مشروعنا للحلويات، نوفر ستاند أو عربانة حلاو يوصلون لكم لين بيتكم تونسون فيهم عيالكم🍭🍬 و نوفر بعد توزيعات الحلاو حق المناسبات ومكاين شعر بنات مع شكر شعر البنات اللي تميزنا في نكهته مو بس الالوان 👌🏼 وبحلاونا نستخدم الجلي التركي الحلال.    ✨Instagram: @candyyshop.kw✨",colors: [Color.pink,Color.blue])

var artkuwait2022 = mashS(name: "✨artkuwait2022✨", accname: "art.kuwait2022", description: "من خلال مشروعنا نقدر نرسم على المبخر على حسب الطلب، نوفر توزيعات لكل المناسبات ومنها توزيعات للقرقيعان.             ✨Instagram: @art.kuwait2022✨",colors: [Color.white,Color.black])
var Palghorzah = mashS(name: "✨Palestine Ghorzah✨", accname: "", description: "مشروع لبيع هدايا رمزية بتطريز فلسطيني، غُرزة فلسطينية مصنوعة يدوياً ومطّرزة بحب.             ✨Instagram: @pal.ghorzah✨", colors:[Color.white,Color.red] )
var Fatishop = mashS(name: "✨Fati Shop✨", accname: "", description: "فاتي شوب، عندنا عدسات سنوية على ٥ والوانها هادية وجميلة ومريحة للعين والعيون الحساسة بشهادة زبايني، باقي الاشياء اللي نوفرها يا تكون مو موجودة بالسوق او تكون موجودة بس تحصلونها عندنا ارخص.                     ✨Instagram: @fati.shopq8✨", colors: [Color.white,Color.black])
var mashSarry = [
    candyshop , Deserve , EmbroidryF , HyaAccessories , Nbracelets , sahcrafts , sargovel , ShMaker , SOC , QoutesTeeshirts , TaibaThreads , BraceletsKw , Elencx , Shinelineq8 , CandyTreats , artkuwait2022 , Palghorzah , Fatishop
]
