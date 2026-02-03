package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.IntConsumer$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.IntStream;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acrn implements egzv<Optional<acxk>> {
    final /* synthetic */ acrt a;

    public acrn(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        ekrw ekrwVarJ = acrt.a.j();
        ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$4", "onError", (char) 1420, "HomeFragmentPeer.java")).q("Error getting conversation changed view part");
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            return;
        }
        final oun ounVarL = ((acwj) this.a.q.b()).l();
        final ConversationIdType conversationIdTypeC = ((acxk) optional.get()).c();
        if (ounVarL != null) {
            IntStream.CC.range(0, ounVarL.size()).filter(new IntPredicate() { // from class: acrl
                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$and(this, intPredicate);
                }

                public final /* synthetic */ IntPredicate negate() {
                    return IntPredicate$CC.$default$negate(this);
                }

                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                    return IntPredicate$CC.$default$or(this, intPredicate);
                }

                @Override // java.util.function.IntPredicate
                public final boolean test(int i) {
                    List list = ounVarL;
                    return list.get(i) != null && conversationIdTypeC.equals(((adao) list.get(i)).k().w());
                }
            }).findFirst().ifPresent(new IntConsumer() { // from class: acrm
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    ekhv ekhvVar = new ekhv();
                    ekhvVar.c(((acxk) optional.get()).b());
                    ((acwj) this.a.a.q.b()).r(i, new adai(ekhvVar.g(), true));
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        }
    }

    @Override // defpackage.egzv
    public final void hn() {
    }
}
