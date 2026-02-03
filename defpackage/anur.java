package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anur {
    public static final ProfilesTable.BindData a(final ParticipantsTable.BindData bindData) {
        bindData.getClass();
        ProfilesTable.BindData bindDataA = ((anuf) ProfilesTable.d("ProfileRowFactoryImpl#getOrCreateProfileRowFromParticipantId", new dqsh(new ejxr() { // from class: anuj
            @Override // defpackage.ejxr
            public final Object get() {
                String strR = bindData.R();
                strR.getClass();
                return new anud(anuq.a(Long.parseLong(strR)), false);
            }
        }), new dqsf(new Function() { // from class: anuk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((anuf) obj).a() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dqsg(new Function() { // from class: anul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr = ProfilesTable.a;
                bsrt bsrtVar = new bsrt();
                ParticipantsTable.BindData bindData2 = bindData;
                bsrtVar.k(String.valueOf(bindData2.M()));
                String strR = bindData2.R();
                strR.getClass();
                bsrtVar.i(Long.parseLong(strR));
                return new anud(bsrtVar.a(), true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }))).a();
        bindDataA.getClass();
        return bindDataA;
    }

    public static final ProfilesTable.BindData b(final ResolvedRecipient resolvedRecipient) {
        ProfilesTable.BindData bindDataA = ((anuf) ProfilesTable.d("ProfileRowFactoryImpl#getOrCreateProfileRowFromRecipient", new dqsh(new ejxr() { // from class: anum
            @Override // defpackage.ejxr
            public final Object get() {
                String str = resolvedRecipient.F().a;
                str.getClass();
                return new anud(anuq.a(Long.parseLong(str)), false);
            }
        }), new dqsf(new Function() { // from class: anun
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((anuf) obj).a() == null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new dqsg(new Function() { // from class: anuo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String[] strArr = ProfilesTable.a;
                bsrt bsrtVar = new bsrt();
                ResolvedRecipient resolvedRecipient2 = resolvedRecipient;
                bsrtVar.k(resolvedRecipient2.g().o());
                String str = resolvedRecipient2.F().a;
                str.getClass();
                bsrtVar.i(Long.parseLong(str));
                return new anud(bsrtVar.a(), true);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }))).a();
        bindDataA.getClass();
        return bindDataA;
    }
}
