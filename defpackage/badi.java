package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class badi extends babu implements lzf {
    public static final cqce a = cqce.g("BugleDataModel", "ConversationListData");
    protected badh b;
    public final cdpg c;
    public final Optional d;
    public lzg e;
    public Bundle f;
    private final fcsu g;
    private final axgc h;
    private final Context i;
    private final Optional j;
    private final fcsu k;

    public badi(fcsu fcsuVar, fcsu fcsuVar2, axgc axgcVar, Context context, badh badhVar, cdpg cdpgVar, Optional optional, Optional optional2) {
        this.k = fcsuVar;
        this.g = fcsuVar2;
        this.h = axgcVar;
        this.b = badhVar;
        this.i = context;
        this.j = optional;
        this.c = cdpgVar;
        this.d = optional2;
    }

    @Override // defpackage.lzf
    public final lzp a(int i, Bundle bundle) {
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.I("onCreateLoader.");
        cqbdVarA.y("id", i);
        cqbdVarA.r();
        String string = bundle.getString("bindingId");
        if (!j(string)) {
            cqceVar.r("Creating loader after unbinding list.");
            return null;
        }
        if (i == 1) {
            axgc axgcVar = this.h;
            Context context = this.i;
            return axgcVar.a(string, context, bace.i(context), new lcj() { // from class: badg
                @Override // defpackage.lcj
                public final Object a() {
                    badi badiVar = this.a;
                    bcvf bcvfVarA = badiVar.c.a();
                    bbmq bbmqVar = (bbmq) bcvfVarA;
                    bbmqVar.e = Boolean.valueOf(badiVar.e());
                    if (badiVar.e()) {
                        bcvfVarA.c(true);
                    }
                    Optional optional = badiVar.d;
                    if (optional.isPresent()) {
                        ((Boolean) optional.get()).booleanValue();
                        bbmqVar.d = true;
                    }
                    return bcvfVarA.a().l();
                }
            });
        }
        if (i != 3) {
            cqaz.c("Unknown loader id");
            return null;
        }
        cqaz.c("Should be handled by annotationsLoaderCallbacks");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzf
    public final /* bridge */ /* synthetic */ void b(lzp lzpVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!j(((bacg) lzpVar).t())) {
            a.r("Loader finished after unbinding list.");
            return;
        }
        int i = lzpVar.b;
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("onLoadFinished.");
        cqbdVarA.y("id", i);
        cqbdVarA.y("dataSize", cursor != null ? cursor.getCount() : 0);
        cqbdVarA.r();
        if (i == 1) {
            if (cursor instanceof dqqf) {
                ((dqqf) cursor).di();
            }
            this.b.r(this, cursor);
        } else if (i != 3) {
            cqaz.c("Unknown loader id");
        } else {
            cqaz.c("Should be handled by annotationsLoaderCallbacks");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzf
    public final void c(lzp lzpVar) {
        int i = lzpVar.b;
        if (!j(((bacg) lzpVar).t())) {
            a.r("Loader reset after unbinding list.");
            return;
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("onLoaderReset.");
        cqbdVarA.y("id", i);
        cqbdVarA.r();
        if (i == 1) {
            this.b.r(this, null);
        } else if (i != 3) {
            cqaz.c("Unknown loader id");
        } else {
            cqaz.c("Should be handled by annotationsLoaderCallbacks");
        }
    }

    public final void d(boolean z) {
        ((bwwe) this.g.b()).d(z);
        if (z) {
            ekrg ekrgVar = cqca.a;
            ((cgfk) this.k.b()).a(cgfj.a);
        }
    }

    public final boolean e() {
        Optional optional = this.j;
        optional.isPresent();
        return ((Boolean) optional.get()).booleanValue();
    }

    @Override // defpackage.babu
    protected final void h() {
        this.b = null;
        lzg lzgVar = this.e;
        if (lzgVar != null) {
            lzgVar.b(1);
            this.e.b(3);
            this.e = null;
        }
    }
}
