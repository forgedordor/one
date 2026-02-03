package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxig {
    public static final cczv a = cdag.p(154643523);
    public static final eksp b = eksp.c("BugleJobs");
    public final fcsu c;
    private final Set i;
    public final ejxr e = ejxx.a(new ejxr() { // from class: bxhm
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = bxig.a;
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("TableChangeObserver-messages");
            brdrVarD.e(new Function() { // from class: bxhr
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    cczv cczvVar2 = bxig.a;
                    return new brao[]{branVar.a, branVar.n, branVar.k};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return brdrVarD.b();
        }
    });
    public final ejxr f = ejxx.a(new ejxr() { // from class: bxhn
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = bxig.a;
            botb botbVarE = botm.e();
            botbVarE.A("TableChangeObserver-conversations");
            botbVarE.f(new Function() { // from class: bxhq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cczv cczvVar2 = bxig.a;
                    ArrayList arrayList = new ArrayList();
                    bopp boppVar = botm.c;
                    arrayList.add(boppVar.a);
                    arrayList.add(boppVar.c);
                    arrayList.add(boppVar.q);
                    arrayList.add(boppVar.aq);
                    return (bopq[]) arrayList.toArray(new bopq[arrayList.size()]);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return botbVarE.b();
        }
    });
    public final ejxr g = ejxx.a(new ejxr() { // from class: bxho
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = bxig.a;
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.A("TableChangeObserver-participants");
            bsboVarE.e(new Function() { // from class: bxhs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brzh brzhVar = (brzh) obj;
                    cczv cczvVar2 = bxig.a;
                    return new brzi[]{brzhVar.a, brzhVar.m, brzhVar.h, brzhVar.f, brzhVar.r};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return bsboVarE.b();
        }
    });
    public final ejxr h = ejxx.a(new ejxr() { // from class: bxhp
        @Override // defpackage.ejxr
        public final Object get() {
            cczv cczvVar = bxig.a;
            bpzs bpzsVarA = bpzx.a();
            bpzsVarA.A("TableChangeObserver-message_annotations");
            bpzsVarA.c(new Function() { // from class: bxhl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpzc bpzcVar = (bpzc) obj;
                    cczv cczvVar2 = bxig.a;
                    return new bpzd[]{bpzcVar.a, bpzcVar.c, bpzcVar.e};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return bpzsVarA.b();
        }
    });
    public final AtomicBoolean d = new AtomicBoolean(false);

    public bxig(Set set, fcsu fcsuVar) {
        this.i = set;
        this.c = fcsuVar;
    }

    public final bxhu a(int i) {
        return new bxht(this.i, b, i);
    }
}
