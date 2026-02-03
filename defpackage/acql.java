package defpackage;

import android.content.res.Resources;
import android.view.ActionMode;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acql extends pcv {
    final /* synthetic */ acrt a;

    public acql(acrt acrtVar) {
        this.a = acrtVar;
    }

    @Override // defpackage.pcv
    public final /* bridge */ /* synthetic */ void a(Object obj, final boolean z) {
        final String str = (String) obj;
        ekrw ekrwVarE = acrt.a.e();
        ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer$11", "onItemStateChanged", 1714, "HomeFragmentPeer.java")).E("onItemStateChanged: key=%s, selected=%s", str, z);
        final acrt acrtVar = this.a;
        acom acomVar = acrtVar.b;
        if (acomVar.G() != null && acrtVar.aP.l(str) == z) {
            if (z && !acrtVar.B()) {
                acrtVar.n();
            }
            if (acrtVar.B()) {
                final cwvv cwvvVarK = acrt.k(acomVar.fg());
                if (cwvvVarK.e(barn.b(str)) != z) {
                    oun ounVarL = ((acwj) acrtVar.q.b()).l();
                    (ounVarL == null ? Optional.empty() : Collection.EL.stream(ounVarL).filter(new Predicate() { // from class: acwg
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            adao adaoVar = (adao) obj2;
                            eksp ekspVar = acwj.d;
                            return adaoVar != null && str.equals(adaoVar.k().w().a());
                        }
                    }).findFirst()).ifPresent(new Consumer() { // from class: acow
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) throws Resources.NotFoundException {
                            eksp ekspVar = acwj.d;
                            SelectedConversation selectedConversationA = acwk.a((adao) obj2);
                            ConversationIdType conversationIdType = selectedConversationA.a;
                            if (conversationIdType == null) {
                                return;
                            }
                            acrt acrtVar2 = acrtVar;
                            boolean z2 = z;
                            cwvv cwvvVar = cwvvVarK;
                            cwvvVar.b = acrtVar2.aX;
                            if (z2) {
                                cwvvVar.a.put(conversationIdType, selectedConversationA);
                            } else {
                                cwvvVar.a.remove(conversationIdType);
                            }
                            cwvvVar.d();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (acrtVar.aO.e().isPresent()) {
                        ((ActionMode) acrtVar.aO.e().get()).setTitle(((asgt) acrtVar.bw.b()).a() ? Integer.toString(cwvvVarK.a()) : acomVar.B().getQuantityString(R.plurals.selected_count, cwvvVarK.a(), Integer.valueOf(cwvvVarK.a())));
                    }
                    acrtVar.aO.g();
                }
            }
        }
    }
}
