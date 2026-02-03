package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amim implements ancm {
    public final fcsu a;
    public final fcsu b;
    private final amip c;
    private final Set d;

    public amim(amip amipVar, fcsu fcsuVar, fcsu fcsuVar2) {
        amipVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.c = amipVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.d = fcwm.d(amwd.TABLE_HEAD, amwd.TABLE_BODY, amwd.TABLE_ROW, amwd.TABLE_CELL);
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        bpzs bpzsVarA = bpzx.a();
        bpzsVarA.A("LoadMessageAnnotationExtension#extendQuery");
        bpzsVarA.c(new Function() { // from class: amij
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpzc bpzcVar = (bpzc) obj;
                fcww fcwwVar = new fcww((byte[]) null);
                fcwwVar.add(bpzcVar.d);
                fcwwVar.add(bpzcVar.e);
                bpzd[] bpzdVarArr = (bpzd[]) fcva.a(fcwwVar).toArray(new bpzd[0]);
                return (bpzd[]) Arrays.copyOf(bpzdVarArr, bpzdVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpzsVarA.e(new Function() { // from class: amik
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpzw bpzwVar = (bpzw) obj;
                if (((Boolean) ((cczi) crbf.aD.get()).e()).booleanValue()) {
                    return bpzwVar;
                }
                bpzwVar.ap(new dqpm("messages_annotations.annotation_type", 4, bpzw.at(new int[0]), true));
                return bpzwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpzr bpzrVarB = bpzsVarA.b();
        bpzd bpzdVar = bpzx.c.c;
        brao braoVar = MessagesTable.c.a;
        bpzw bpzwVar = new bpzw();
        bpzwVar.c();
        brdrVar.H(bpzrVarB.t(bpzdVar, braoVar, new bpzv(bpzwVar)).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        String[] strArr = bpzx.a;
        bpyn[] bpynVarArr = (bpyn[]) bindData.aH("messages_annotations", new bpyn[0]);
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator itA = fdbd.a(bpynVarArr);
        int i2 = 1;
        while (itA.hasNext()) {
            bpyn bpynVar = (bpyn) itA.next();
            if (bpynVar.k() == 1) {
                i2 = 2;
            }
            ezds ezdsVarO = bpynVar.o();
            if (ezdsVarO != null) {
                amil amilVar = new amil(ezdsVarO, this, andwVar);
                if (!this.d.contains(amilVar.c())) {
                    ekfwVar.h(amilVar);
                } else if (((Boolean) ((cczi) crbf.aD.get()).e()).booleanValue()) {
                    ekfwVar.h(amilVar);
                }
            }
        }
        ((anaq) anckVar).j = i2;
        anckVar.b(ekfwVar.g());
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.c;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
