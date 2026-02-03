package defpackage;

import android.content.Context;
import android.os.Bundle;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baic extends babu implements lzf {
    private static final cqce c = cqce.g("Bugle", "PairedDesktopsData");
    public lzg a;
    public final List b = new ArrayList();
    private final axgc d;
    private final Context e;
    private baib f;

    public baic(axgc axgcVar, Context context, baib baibVar) {
        this.d = axgcVar;
        this.e = context;
        this.f = baibVar;
    }

    @Override // defpackage.lzf
    public final lzp a(int i, Bundle bundle) {
        String string = bundle.getString("bindingId");
        if (!j(string)) {
            c.r("Creating desktops loader after unbinding.");
            return null;
        }
        cqce cqceVar = bvkr.a;
        bozw bozwVarA = bpab.a();
        bozwVarA.A("DittoDesktops#getDesktopsPairedViaQrQuery");
        bozwVarA.f(new Function() { // from class: bviz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar2 = bvkr.a;
                bpaaVar.d(bvdu.ANONYMOUS);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozwVarA.d(new bozt(bpab.c.c));
        final bozu bozuVarB = bozwVarA.b();
        axgc axgcVar = this.d;
        Context context = this.e;
        return axgcVar.a(string, context, bace.k(context), new lcj() { // from class: bahz
            @Override // defpackage.lcj
            public final Object a() {
                return bozuVarB;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzf
    public final /* bridge */ /* synthetic */ void b(lzp lzpVar, Object obj) {
        boyp boypVar = (boyp) obj;
        if (!j(((bacg) lzpVar).t())) {
            c.r("Self loader finished after unbinding.");
            return;
        }
        boypVar.di();
        d(boypVar);
        baib baibVar = this.f;
        if (baibVar != null) {
            cyod cyodVar = (cyod) baibVar;
            cyodVar.b.d();
            List list = this.b;
            cyor cyorVar = cyodVar.c;
            cyorVar.i = list;
            cyorVar.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lzf
    public final void c(lzp lzpVar) {
        if (j(((bacg) lzpVar).t())) {
            d(null);
        } else {
            c.r("Self loader reset after unbinding.");
        }
    }

    public final void d(boyp boypVar) {
        List list = this.b;
        list.clear();
        if (boypVar != null) {
            if (boypVar.moveToFirst()) {
                list.add(new baia(boypVar));
            }
            while (boypVar.moveToNext()) {
                list.add(new baia(boypVar));
            }
        }
    }

    @Override // defpackage.babu
    protected final void h() {
        this.f = null;
        lzg lzgVar = this.a;
        if (lzgVar != null) {
            lzgVar.b(1);
            this.a = null;
        }
    }
}
