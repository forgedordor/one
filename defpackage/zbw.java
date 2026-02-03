package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbw {
    public static final ekrg a;
    private static final Map d = fcwa.g(new fcti("👍", "thumbs_up_reaction_effect.binarypb"), new fcti("❤️", "love_reaction_effect.binarypb"), new fcti("😂", "laugh_reaction_effect.binarypb"), new fcti("😮", "surprise_reaction_effect.binarypb"), new fcti("😢", "sad_reaction_effect.binarypb"), new fcti("😡", "anger_reaction_effect.binarypb"), new fcti("😠", "anger_reaction_effect.binarypb"), new fcti("👎", "thumbs_down_reaction_effect.binarypb"), new fcti("💩", "poop_reaction_effect.binarypb"), new fcti("🎉", "celebrate_reaction_effect.binarypb"));
    public final fcsu b;
    public final Map c;
    private final fdjx e;
    private final Map f;

    static {
        fcwa.g(new fcti("👍", "thumbs_up_reaction_effect.binarypb"), new fcti("👍🏻", "thumbs_up_reaction_effect.binarypb"), new fcti("👍🏽", "thumbs_up_reaction_effect.binarypb"), new fcti("👍🏿", "thumbs_up_reaction_effect.binarypb"), new fcti("👍🏼", "thumbs_up_reaction_effect.binarypb"), new fcti("👍🏾", "thumbs_up_reaction_effect.binarypb"), new fcti("❤️", "love_reaction_effect.binarypb"), new fcti("😂", "laugh_reaction_effect.binarypb"), new fcti("😮", "surprise_reaction_effect.binarypb"), new fcti("😢", "sad_reaction_effect.binarypb"), new fcti("😡", "anger_reaction_effect.binarypb"), new fcti("😠", "anger_reaction_effect.binarypb"), new fcti("👎", "thumbs_down_reaction_effect.binarypb"), new fcti("👎🏻", "thumbs_down_reaction_effect.binarypb"), new fcti("👎🏽", "thumbs_down_reaction_effect.binarypb"), new fcti("👎🏿", "thumbs_down_reaction_effect.binarypb"), new fcti("👎🏼", "thumbs_down_reaction_effect.binarypb"), new fcti("👎🏾", "thumbs_down_reaction_effect.binarypb"), new fcti("💩", "poop_reaction_effect.binarypb"), new fcti("🎉", "celebrate_reaction_effect.binarypb"));
        a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/effects/ReactionEffectAnimationMap");
    }

    public zbw(fcsu fcsuVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.e = fdjxVar;
        this.f = new LinkedHashMap();
        Map map = d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Set setI = new dnmi(new dnjr(str)).i();
            ArrayList arrayList2 = new ArrayList(fcva.p(setI, 10));
            Iterator it = setI.iterator();
            while (it.hasNext()) {
                arrayList2.add(((dnkd) it.next()).a);
            }
            ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new fcti((String) it2.next(), str2));
            }
            fcva.y(arrayList, arrayList3);
        }
        Map mapK = fcwa.k(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapK.size()));
        for (Map.Entry entry2 : mapK.entrySet()) {
            Object key = entry2.getKey();
            String str3 = (String) entry2.getValue();
            Map map2 = this.f;
            Object obj = map2.get(str3);
            if (obj == null) {
                fduf fdufVarA = fdvf.a(null);
                auvw.k(this.e, null, null, new zbv(this, str3, fdufVarA, null), 3);
                map2.put(str3, fdufVarA);
                obj = fdufVarA;
            }
            linkedHashMap.put(key, (fdvc) obj);
        }
        this.c = linkedHashMap;
    }
}
