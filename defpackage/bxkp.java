package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxkp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh");
    static final cczi b = cdag.h(cdag.b, "disable_logging_participant_refresh", false);
    static final dzfh c = new dzfh("ParticipantRefreshFromContactsLatency");
    public static final cqce d = cqce.g("BugleDataModel", "ParticipantRefresh");
    public static final bsbm e;
    private final Context A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    public final fcsu f;
    public final fcsu g;
    public final dqsn h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final eosc x;
    private final fcsu y;
    private final bxko z;

    static {
        cdag.h(cdag.b, "enable_overriding_normalized_destination_only_with_valid_destination", true);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("SELF_PARTICIPANTS_WITH_INVALID_SIM_SLOT_ID_QUERY");
        bsboVarE.c(ParticipantsTable.c.a);
        bsboVarE.h(new Function() { // from class: bxkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                ekrg ekrgVar = bxkp.a;
                bsbxVar.u(-1);
                bsbxVar.x();
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e = bsboVarE.b();
    }

    public bxkp(fcsu fcsuVar, bxko bxkoVar, fcsu fcsuVar2, Context context, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, dqsn dqsnVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, eosc eoscVar, fcsu fcsuVar21) {
        this.y = fcsuVar;
        this.z = bxkoVar;
        this.f = fcsuVar2;
        this.A = context;
        this.B = fcsuVar3;
        this.C = fcsuVar4;
        this.g = fcsuVar5;
        this.h = dqsnVar;
        this.i = fcsuVar6;
        this.j = fcsuVar8;
        this.k = fcsuVar7;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = fcsuVar11;
        this.o = fcsuVar12;
        this.p = fcsuVar13;
        this.q = fcsuVar14;
        this.r = fcsuVar15;
        this.s = fcsuVar16;
        this.t = fcsuVar17;
        this.u = fcsuVar18;
        this.v = fcsuVar19;
        this.w = fcsuVar20;
        this.x = eoscVar;
        this.D = fcsuVar21;
    }

    final void a() {
        bxko bxkoVar = this.z;
        if (bxkoVar.c.compareAndSet(false, true)) {
            d.p("ContactContentObserver initialize");
            bxkoVar.a.getContentResolver().registerContentObserver(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, true, bxkoVar);
            bxkoVar.b.set(true);
        }
    }

    public final void b(final ParticipantsTable.BindData bindData) {
        final bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("ParticipantRefresh#updateParticipant");
        bsbsVarF.H(bindData.T());
        bsbsVarF.n(bindData.u());
        bsbsVarF.B(bindData.S());
        bsbsVarF.v(bindData.Q());
        bsbsVarF.t(bindData.P());
        bsbsVarF.M(bindData.x());
        bsbsVarF.j(bbax.a(bindData).b);
        bsbsVarF.s(bbax.a(bindData).c);
        bsbsVarF.I(bindData.p());
        bsbsVarF.l(bindData.N());
        bsbsVarF.N(bindData.V());
        bsbsVarF.R(bindData.W());
        bsbsVarF.q(bindData.v());
        bsbsVarF.G(bindData.y());
        bsbsVarF.J(bindData.G());
        bsbsVarF.F(bindData.F());
        if (bbdl.k(bindData)) {
            bsbsVarF.r(bindData.O());
        }
        final String strR = bindData.R();
        if (strR != null) {
            this.h.d("ParticipantRefresh#updateParticipant", new Runnable() { // from class: bxkc
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    int size;
                    boolean zBooleanValue = ((Boolean) ((cczi) bbcb.b.get()).e()).booleanValue();
                    bxkp bxkpVar = this.a;
                    bsbs bsbsVar = bsbsVarF;
                    final String str = strR;
                    if (zBooleanValue) {
                        bbcx bbcxVar = bbdl.k(bindData) ? bbcx.h : bbcx.i;
                        bbce bbceVar = (bbce) bxkpVar.o.b();
                        bsbsVar.U(new Function() { // from class: bxkl
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                ekrg ekrgVar = bxkp.a;
                                bsbxVar.k(str);
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsbsVar.am();
                        size = bbceVar.b(bsbsVar, bbcxVar);
                    } else if (((Boolean) ((cczi) bbcb.a.get()).e()).booleanValue()) {
                        bbce bbceVar2 = (bbce) bxkpVar.o.b();
                        bsbsVar.U(new Function() { // from class: bxkm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                ekrg ekrgVar = bxkp.a;
                                bsbxVar.k(str);
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsbsVar.am();
                        size = bbceVar2.a(bsbsVar.b());
                    } else {
                        bsbsVar.U(new Function() { // from class: bxkn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bsbx bsbxVar = (bsbx) obj;
                                ekrg ekrgVar = bxkp.a;
                                bsbxVar.k(str);
                                return bsbxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bsbsVar.am();
                        size = bsbsVar.b().a().size();
                    }
                    String strConcat = size == 0 ? "No update made to participant: ".concat(str) : "Successfully updated participant: ".concat(str);
                    if (size != 1) {
                        bxkp.d.p(strConcat);
                        ((bbdg) bxkpVar.i.b()).a(4, 3);
                    } else {
                        bxkp.d.q(strConcat);
                        ((bbdg) bxkpVar.i.b()).a(4, 2);
                    }
                }
            });
        }
    }

    final boolean c() {
        fcsu fcsuVar = this.C;
        return ((crma) fcsuVar.b()).h() && ((crma) fcsuVar.b()).k();
    }

    public final boolean d(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        boolean zAk = ((bakt) this.y.b()).ak(conversationIdType, selfIdentityId);
        if (zAk) {
            ((bxlc) this.B.b()).d(conversationIdType);
        }
        avmn.a(this.A, conversationIdType, selfIdentityId);
        return zAk;
    }

    public final boolean e(final brvp brvpVar, final int i) {
        ajfx ajfxVar = (ajfx) this.D.b();
        dzfh dzfhVar = c;
        Supplier supplier = new Supplier() { // from class: bxju
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
            /* JADX WARN: Type inference failed for: r5v2, types: [int] */
            @Override // java.util.function.Supplier
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 859
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bxju.get():java.lang.Object");
            }
        };
        dzub dzubVarD = ajfxVar.a.d();
        dzua dzuaVar = dzua.SUCCESS;
        try {
            try {
                Object obj = supplier.get();
                ajfxVar.a.f(dzubVarD, dzfhVar, null, dzuaVar);
                return ((Boolean) obj).booleanValue();
            } catch (RuntimeException e2) {
                dzuaVar = dzua.ERROR;
                throw e2;
            }
        } catch (Throwable th) {
            ajfxVar.a.f(dzubVarD, dzfhVar, null, dzuaVar);
            throw th;
        }
    }
}
