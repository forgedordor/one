package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayad implements ejxr {
    final /* synthetic */ aybe a;
    final /* synthetic */ brvp b;
    final /* synthetic */ fdce c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cmny e;
    final /* synthetic */ ConversationIdType f;
    final /* synthetic */ axcy g;
    final /* synthetic */ long h;
    final /* synthetic */ String i;
    final /* synthetic */ baqv j;
    final /* synthetic */ boolean k;
    final /* synthetic */ bvdk l;
    final /* synthetic */ String m;

    public ayad(aybe aybeVar, brvp brvpVar, fdce fdceVar, boolean z, cmny cmnyVar, ConversationIdType conversationIdType, axcy axcyVar, long j, String str, baqv baqvVar, boolean z2, bvdk bvdkVar, String str2) {
        this.a = aybeVar;
        this.b = brvpVar;
        this.c = fdceVar;
        this.d = z;
        this.e = cmnyVar;
        this.f = conversationIdType;
        this.g = axcyVar;
        this.h = j;
        this.i = str;
        this.j = baqvVar;
        this.k = z2;
        this.l = bvdkVar;
        this.m = str2;
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        ParticipantsTable.BindData bindDataD;
        aybe aybeVar = this.a;
        bbca bbcaVar = (bbca) aybeVar.e.b();
        brvp brvpVar = this.b;
        bbcaVar.j(brvpVar);
        fdce fdceVar = this.c;
        int i = fdceVar.a ? 104 : !this.d ? 112 : EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        axkf axkfVar = aybeVar.r;
        boolean zA = axkf.b(brvpVar.a).a();
        if (zA) {
            axkfVar.a(brvpVar.a);
        }
        cmop cmopVar = aybeVar.q;
        cmny cmnyVar = this.e;
        ConversationIdType conversationIdType = this.f;
        MessageCoreData messageCoreDataA = cmopVar.a(cmnyVar, conversationIdType, brvpVar.a, this.g.f(), i, zA ? bvdz.VERIFICATION_UNVERIFIED : bvdz.VERIFICATION_NA, this.h);
        aybeVar.x.g(messageCoreDataA);
        ((bauh) aybeVar.L.b()).a(messageCoreDataA);
        ((cjoj) aybeVar.E.b()).a(conversationIdType);
        String str = brvpVar.a;
        int i2 = bbbd.a;
        ParticipantsTable.BindData bindDataB = ParticipantsTable.b(str);
        if (bindDataB != null) {
            bindDataD = bbbd.d(aybeVar.d, bindDataB, this.i);
            if (bindDataD != null && !zA) {
                if (bindDataD.u() == -3) {
                    aybeVar.s.a(bindDataD).x(115, TimeUnit.SECONDS.toMillis(10L));
                }
                aybeVar.w.b(bindDataD);
                bindDataB = bindDataD;
            }
        } else {
            bindDataD = null;
        }
        if (this.j.b()) {
            if (!((cdmo) aybeVar.Q.b()).d() && this.k) {
                conversationIdType.getClass();
                cdmg.c(conversationIdType);
            } else if (!this.k) {
                conversationIdType.getClass();
                cdmg.b(conversationIdType);
            }
        }
        if (!fdceVar.a) {
            ((baqi) aybeVar.h.b()).e(conversationIdType, messageCoreDataA.C(), Long.valueOf(messageCoreDataA.o()), this.l, true);
            aybeVar.u.b(conversationIdType, bindDataB, messageCoreDataA);
            aybeVar.t.e(conversationIdType, true);
            Optional optional = aybeVar.z;
            final ayac ayacVar = new ayac(this.m);
            optional.ifPresent(new Consumer() { // from class: ayba
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final /* synthetic */ void z(Object obj) {
                    ayacVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (bindDataD != null) {
            ((bakt) aybeVar.f.b()).R(brvpVar.a);
        }
        return messageCoreDataA;
    }
}
