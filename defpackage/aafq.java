package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafq {
    private final axjx a;

    public aafq(axjx axjxVar) {
        axjxVar.getClass();
        this.a = axjxVar;
    }

    public final List a(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        axjx axjxVar = this.a;
        String[] strArrB = axjxVar.b(str);
        axjw axjwVarA = axjw.a();
        StringBuilder sb = axjwVarA.a;
        HashSet hashSet = axjwVarA.b;
        Matcher matcherA = axjxVar.a(strArrB, str2, sb, hashSet);
        if (true != hashSet.isEmpty()) {
            matcherA = null;
        }
        if (matcherA != null) {
            int i = 0;
            while (matcherA.find(i)) {
                int iStart = matcherA.start();
                int iEnd = matcherA.end();
                arrayList.add(new diin(z ? dijs.b : dijs.a, iStart, iEnd, (fdap) null, 24));
                i = iEnd;
            }
        }
        return arrayList;
    }
}
