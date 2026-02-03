package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsof implements dxml {
    public static final eksp a = eksp.c("GnpSdk");
    public final Context b;
    public final fcsu c;
    public final dsna d;
    private final fcyh e;
    private final fcsu f;
    private final String g;
    private final long h;

    public dsof(Context context, fcyh fcyhVar, fcsu fcsuVar, fcsu fcsuVar2, dsna dsnaVar) {
        context.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.e = fcyhVar;
        this.c = fcsuVar;
        this.f = fcsuVar2;
        this.d = dsnaVar;
        this.g = "GNP_IN_APP_ACCOUNT_SYNC";
        Object objB = fcsuVar2.b();
        objB.getClass();
        this.h = ((Number) objB).longValue();
    }

    @Override // defpackage.dxml
    public final int a() {
        return 16;
    }

    @Override // defpackage.dxml
    public final long b() {
        return 0L;
    }

    @Override // defpackage.dxml
    public final Long c() {
        return Long.valueOf(this.h);
    }

    @Override // defpackage.dxml
    public final Object d(Bundle bundle, fcxy fcxyVar) {
        return fdin.a(this.e, new dsod(this, bundle, null), fcxyVar);
    }

    @Override // defpackage.dxml
    public final String e() {
        return this.g;
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

    public final Object i(Exception exc, fcxy fcxyVar) {
        return fdin.a(this.e, new dsoe(exc, null), fcxyVar);
    }
}
