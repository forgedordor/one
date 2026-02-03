package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnf implements dxml {
    public static final eksp a = eksp.c("GnpSdk");
    public final fcsu b;
    public final Context c;
    public final dsna d;
    public final eygg e;
    public final diep f;
    public final fcyh g;
    private final fcsu h;
    private final fcyh i;
    private final String j;
    private final Long k;

    public dsnf(fcsu fcsuVar, Context context, dsna dsnaVar, eygg eyggVar, diep diepVar, fcsu fcsuVar2, fcyh fcyhVar, fcyh fcyhVar2) {
        fcsuVar.getClass();
        context.getClass();
        eyggVar.getClass();
        diepVar.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        this.b = fcsuVar;
        this.c = context;
        this.d = dsnaVar;
        this.e = eyggVar;
        this.f = diepVar;
        this.h = fcsuVar2;
        this.i = fcyhVar;
        this.g = fcyhVar2;
        this.j = "GK_ONEOFF_SYNC";
        this.k = (Long) fcsuVar2.b();
    }

    @Override // defpackage.dxml
    public final int a() {
        return 11;
    }

    @Override // defpackage.dxml
    public final long b() {
        return 0L;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return this.k;
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        return fdin.a(this.i, new dsne(this, null), fcxyVar);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.j;
    }

    @Override // defpackage.dxml
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dxml
    public final boolean g() {
        return true;
    }

    @Override // defpackage.dxml
    public final int h() {
        return 1;
    }
}
