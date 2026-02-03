package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtz {
    public final long a;
    public final ArrayList b;
    public String c;
    public String d;
    public String e;
    public int f;
    public final boolean g;
    public cmtu h;

    public cmtz(long j, Collection collection, boolean z) {
        collection.getClass();
        this.a = j;
        this.b = new ArrayList(collection);
        this.f = 0;
        this.g = z;
    }

    public static cmtz a(cnqj cnqjVar, List list, String str, String str2, String str3) {
        cmtz cmtzVar = new cmtz(cnqk.a(cnqjVar), list, false);
        cmtzVar.c = str;
        cmtzVar.d = str2;
        cmtzVar.e = str3;
        cmtzVar.f = 4;
        return cmtzVar;
    }

    public static cmtz b(cnqj cnqjVar, List list, cmtu cmtuVar) {
        cmtz cmtzVar = new cmtz(cnqk.a(cnqjVar), list, false);
        cmtzVar.h = cmtuVar;
        return cmtzVar;
    }

    public final List c() {
        return this.b;
    }
}
