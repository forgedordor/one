package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvf extends aivg implements vvh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger");
    private final fdjx b;
    private final vub d;
    private final vtg e;
    private final Optional f;
    private final Optional g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvf(fdjx fdjxVar, vub vubVar, vtg vtgVar, Optional optional, Optional optional2, fcsu fcsuVar, aiqn aiqnVar, Executor executor) {
        super(fcsuVar, aiqnVar, executor);
        fdjxVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        executor.getClass();
        this.b = fdjxVar;
        this.d = vubVar;
        this.e = vtgVar;
        this.f = optional;
        this.g = optional2;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: vva
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eliu eliuVar = (eliu) obj;
                emzn emznVar = (emzn) obj2;
                eliuVar.getClass();
                emznVar.getClass();
                eliuVar.copyOnWrite();
                eliv elivVar = (eliv) eliuVar.instance;
                eliv elivVar2 = eliv.a;
                elivVar.d = emznVar;
                elivVar.c = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final Object b(vvw vvwVar, fcxy fcxyVar) {
        ckdw ckdwVar;
        EditingData editingData = vvwVar.f;
        if (editingData == null || (ckdwVar = (ckdw) fdct.b(this.g)) == null) {
            return null;
        }
        Object objB = ckdwVar.b(new ckdu(editingData.a), fcxyVar);
        return objB == fcyl.a ? objB : (emvw) objB;
    }

    public final List c(vvg vvgVar, vup vupVar) {
        Uri uri;
        List<vvs> list = vvgVar.a.b;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (vvs vvsVar : list) {
            if (!(vvsVar instanceof vvr)) {
                Objects.toString(vvsVar);
                throw new IllegalArgumentException("Cannot create AttachmentInfo for pending ".concat(String.valueOf(vvsVar)));
            }
            vvr vvrVar = (vvr) vvsVar;
            dltd dltdVar = vvrVar.a;
            vup vupVar2 = null;
            if (dltdVar instanceof dohr) {
                Map map = vvgVar.c;
                if (!map.containsKey(dltdVar)) {
                    throw new IllegalArgumentException("Missing selected variation for ".concat(String.valueOf(dltdVar.fq())));
                }
                uri = (Uri) fcwa.e(map, dltdVar);
            } else {
                uri = null;
            }
            String str = (String) vvgVar.d.get(dltdVar);
            List listA = str != null ? this.d.a(str, vvgVar.b, true) : fcvo.a;
            if (true == (dltdVar instanceof dojr)) {
                vupVar2 = vupVar;
            }
            arrayList.add(fcva.ah(fcva.b(vtg.a(new vtf(vvrVar, uri, vupVar2))), listA));
        }
        return arrayList;
    }

    public final List d(vvw vvwVar, vto vtoVar) {
        String str = vvwVar.a;
        if (str != null) {
            return this.d.a(str, vtoVar, false);
        }
        return null;
    }

    public final void e(final vvw vvwVar, final enul enulVar) {
        final fdap fdapVar = new fdap() { // from class: vuy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ahpy ahpyVar = (ahpy) obj;
                ahpyVar.getClass();
                if (vvwVar.e != null) {
                    ahpyVar.a(enulVar, new ahpz(basd.a));
                }
                return fctx.a;
            }
        };
        this.f.ifPresent(new Consumer() { // from class: vuz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.vvh
    public final void f(vvg vvgVar, List list, vup vupVar) {
        auvw.k(this.b, null, null, new vve(vvgVar, list, vupVar, this, null), 3);
    }

    @Override // defpackage.vvh
    public final void g(vvg vvgVar, amie amieVar, vup vupVar) {
        amieVar.getClass();
        auvw.k(this.b, null, null, new vvc(vvgVar, amieVar, vupVar, this, null), 3);
    }
}
