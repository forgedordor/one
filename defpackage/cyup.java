package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyup implements lun {
    final /* synthetic */ ea a;
    final /* synthetic */ cujr b;
    final /* synthetic */ tlt c;
    final /* synthetic */ daoe d;
    final /* synthetic */ cyuq e;

    public cyup(cyuq cyuqVar, ea eaVar, cujr cujrVar, tlt tltVar, daoe daoeVar) {
        this.a = eaVar;
        this.b = cujrVar;
        this.c = tltVar;
        this.d = daoeVar;
        this.e = cyuqVar;
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        cujq cujqVar;
        cyuq cyuqVar = this.e;
        ViewTreeObserver viewTreeObserver = cyuqVar.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive() && (cujqVar = cyuqVar.c) != null) {
            cyuqVar.d.removeOnGlobalLayoutListener(cujqVar);
        }
        List list = cyuqVar.a;
        final daoe daoeVar = this.d;
        Stream stream = Collection.EL.stream(list);
        daoeVar.getClass();
        stream.forEach(new Consumer() { // from class: cyun
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                daoeVar.d.remove((dany) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        List list2 = cyuqVar.b;
        Stream stream2 = Collection.EL.stream(list2);
        daoeVar.getClass();
        stream2.forEach(new Consumer() { // from class: cyuo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                daoeVar.c.remove((danz) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        list.clear();
        list2.clear();
    }

    @Override // defpackage.lun
    public final void gF(lvj lvjVar) {
        Window window;
        View decorView;
        eg egVarG = this.a.G();
        if (egVarG == null || (window = egVarG.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        cyuq cyuqVar = this.e;
        cyuqVar.d = decorView.getViewTreeObserver();
        if (cyuqVar.d != null) {
            cyuqVar.c = this.b.a(egVarG, decorView, this.c.a);
            cyuqVar.d.addOnGlobalLayoutListener(cyuqVar.c);
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
