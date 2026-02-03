package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsni implements dxml {
    public static final eksp a = eksp.c("GnpSdk");
    public final fcsu b;
    public final Context c;
    public final dsna d;
    public final fcyh e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcyh i;
    private final String j;
    private final boolean k;
    private final long l;
    private final Long m;

    public dsni(fcsu fcsuVar, Context context, dsna dsnaVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcyh fcyhVar, fcyh fcyhVar2) {
        fcsuVar.getClass();
        context.getClass();
        fcsuVar4.getClass();
        fcyhVar.getClass();
        fcyhVar2.getClass();
        this.b = fcsuVar;
        this.c = context;
        this.d = dsnaVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcyhVar;
        this.e = fcyhVar2;
        this.j = "GK_PERIODIC_SYNC";
        Object objB = fcsuVar4.b();
        objB.getClass();
        this.k = ((Boolean) objB).booleanValue();
        Object objB2 = fcsuVar2.b();
        objB2.getClass();
        this.l = ((Number) objB2).longValue();
        this.m = (Long) fcsuVar3.b();
    }

    @Override // defpackage.dxml
    public final int a() {
        return 12;
    }

    @Override // defpackage.dxml
    public final long b() {
        return this.l;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return this.m;
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        return fdin.a(this.i, new dsnh(this, null), fcxyVar);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.j;
    }

    @Override // defpackage.dxml
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dxml
    public final boolean g() {
        return this.k;
    }

    @Override // defpackage.dxml
    public final int h() {
        return 1;
    }
}
