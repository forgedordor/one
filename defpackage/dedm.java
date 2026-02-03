package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedm {
    public static final dcfd a;
    public static final dcfd b;
    public static final dceu c;
    static final dceu d;
    public static final dcfe e;

    static {
        dcfd dcfdVar = new dcfd();
        a = dcfdVar;
        dcfd dcfdVar2 = new dcfd();
        b = dcfdVar2;
        dedj dedjVar = new dedj();
        c = dedjVar;
        dedk dedkVar = new dedk();
        d = dedkVar;
        new Scope("profile");
        new Scope("email");
        e = new dcfe("SignIn.API", dedjVar, dcfdVar);
        new dcfe("SignIn.INTERNAL_API", dedkVar, dcfdVar2);
    }
}
