package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsbx extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bsbt(this);
    }

    public final void b(Function... functionArr) {
        bsbx[] bsbxVarArr = new bsbx[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = ParticipantsTable.a;
            bsbxVarArr[i] = (bsbx) function.apply(new bsbx());
        }
        aq(bsbxVarArr);
    }

    public final void c() {
        ap(new dqty("participants.blocked", 1, 1));
    }

    public final void d(String str) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 31020) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpj("participants.cms_id", 1, String.valueOf(str)));
    }

    public final void e(Iterable iterable) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 31020) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpm("participants.cms_id", 3, as(iterable), false));
    }

    public final void f() {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 31020) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("participants.cms_id", 6));
    }

    public final void g() {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 31020) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("participants.cms_id", 5));
    }

    public final void h(cpyi... cpyiVarArr) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqpm("participants.cms_life_cycle", 3, as((Iterable) DesugarArrays.stream(cpyiVarArr).map(new Function() { // from class: bsbu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cpyi) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new bsbv()))), true));
    }

    public final void i(cpyi cpyiVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 58210) {
            dqru.x("cms_life_cycle", iIntValue);
        }
        ap(new dqty("participants.cms_life_cycle", 2, Integer.valueOf(cpyiVar == null ? 0 : cpyiVar.ordinal())));
    }

    public final void j(Iterable iterable) {
        ap(new dqpm("participants.contact_id", 3, as(iterable), true));
    }

    public final void k(String str) {
        ap(new dqpj("participants._id", 1, String.valueOf(str)));
    }

    public final void l(dqxe dqxeVar) {
        ap(new dqpk("participants._id", 3, dqxeVar));
    }

    public final void m(Iterable iterable) {
        ap(new dqpm("participants._id", 3, as(iterable), false));
    }

    public final void n(long j) {
        ap(new dqty("participants._id", 10, Long.valueOf(j)));
    }

    public final void o(boolean z) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 60640) {
            dqru.x("is_enterprise_contact", iIntValue);
        }
        ap(new dqty("participants.is_enterprise_contact", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void p(bvdz bvdzVar) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 31030) {
            dqru.x("latest_verification_status", iIntValue);
        }
        ap(new dqty("participants.latest_verification_status", 2, Integer.valueOf(bvdzVar == null ? 0 : bvdzVar.ordinal())));
    }

    public final void q() {
        ap(new dqpn("participants.lookup_key", 5));
    }

    public final void r(String str) {
        ap(new dqpj("participants.normalized_destination", 1, String.valueOf(str)));
    }

    public final void s(Iterable iterable) {
        ap(new dqpm("participants.normalized_destination", 3, as(iterable), false));
    }

    public final void t() {
        ap(new dqpn("participants.profile_photo_uri", 6));
    }

    public final void u(int i) {
        int iIntValue = ParticipantsTable.i().intValue();
        if (iIntValue < 2000) {
            dqru.x("sim_slot_id", iIntValue);
        }
        ap(new dqty("participants.sim_slot_id", 1, Integer.valueOf(i)));
    }

    public final void v(int i) {
        ap(new dqty("participants.sub_id", 1, Integer.valueOf(i)));
    }

    public final void w(int i) {
        ap(new dqty("participants.sub_id", 7, Integer.valueOf(i)));
    }

    public final void x() {
        ap(new dqty("participants.sub_id", 2, -2));
    }
}
