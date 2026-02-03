package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byqi {
    public static final ejxr a = cdag.w(174785576, "cms_initial_backup_skip_dlq_entries");
    public static final cqce b = cqce.g("BugleCms", "CmsInitialBackupScheduler");
    public final bykf c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    private final efwo k;
    private final cogw l;

    public byqi(efwo efwoVar, bykf bykfVar, cogw cogwVar, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.k = efwoVar;
        this.c = bykfVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.l = cogwVar;
    }

    private static final bmqq f(final int i) {
        bmqr bmqrVarA = bmqy.a();
        bmqrVarA.A("getDeadLetterBugleIdsQueryForTable");
        bmpx[] bmpxVarArr = {(bmpx) new Function() { // from class: byqd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ejxr ejxrVar = byqi.a;
                return ((bmpw) obj).g;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bmqy.c)};
        int iIntValue = bmqy.c().intValue();
        if (((Integer) bmqy.b.getOrDefault(bmpxVarArr[0].toString(), -1)).intValue() > iIntValue) {
            dqru.x("columnReference.toString()", iIntValue);
        }
        bmqrVarA.m(bmpxVarArr);
        bmqrVarA.c(new Function() { // from class: byqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmqx bmqxVar = (bmqx) obj;
                ejxr ejxrVar = byqi.a;
                bmqxVar.c(i);
                bmqxVar.b(bmqz.BACKUP_CREATE, bmqz.INITIAL_BACKUP_CREATE, bmqz.INCREMENTAL_BACKUP_CREATE);
                return bmqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bmqrVarA.b();
    }

    public final bnca a() {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.i(1, 3);
        String[] strArr = bncb.a;
        bnca bncaVar = new bnca();
        Function[] functionArr = {new Function() { // from class: byqb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnca bncaVar2 = (bnca) obj;
                byqi byqiVar = this.a;
                bncaVar2.e(byqiVar.e);
                bncaVar2.d(byqiVar.f);
                return bncaVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: byqc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bnca bncaVar2 = (bnca) obj;
                bncaVar2.ap(new dqty("cms.key_type", 8, Integer.valueOf(this.a.e)));
                return bncaVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }};
        bnca[] bncaVarArr = new bnca[2];
        for (int i2 = 0; i2 < 2; i2++) {
            bncaVarArr[i2] = (bnca) functionArr[i2].apply(new bnca());
        }
        bncaVar.aq(bncaVarArr);
        bncaVar.b();
        bncaVar.ap(new dqpm("cms.key_type", 3, bnca.as(ekfwVar.g()), true));
        return bncaVar;
    }

    public final botl b() {
        String[] strArr = botm.a;
        botl botlVar = new botl();
        botlVar.v(this.h);
        botlVar.g();
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            botlVar.ap(new dqpk("conversations._id", 4, f(2)));
        }
        return botlVar;
    }

    public final brec c() {
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.w(this.i);
        brecVar.T(this.j);
        brecVar.h();
        brecVar.L(2);
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            brecVar.x(f(1));
        }
        return brecVar;
    }

    public final bsbx d() {
        String[] strArr = ParticipantsTable.a;
        bsbx bsbxVar = new bsbx();
        bsbxVar.n(this.g);
        bsbx bsbxVar2 = new bsbx();
        bsbxVar2.v(-1);
        bsbx bsbxVar3 = new bsbx();
        bsbxVar3.v(-2);
        bsbxVar.aq(bsbxVar2, bsbxVar3);
        bsbxVar.g();
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            bsbxVar.ap(new dqpk("participants._id", 4, f(3)));
        }
        return bsbxVar;
    }

    public final void e(int i, String str, int i2) {
        byiu byiuVar = (byiu) byiv.a.createBuilder();
        int iA = this.k.a();
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byivVar.b |= 1;
        byivVar.c = iA;
        byiuVar.copyOnWrite();
        byiv byivVar2 = (byiv) byiuVar.instance;
        byivVar2.b |= 16;
        byivVar2.g = true;
        byiuVar.copyOnWrite();
        byiv byivVar3 = (byiv) byiuVar.instance;
        byivVar3.b |= 2;
        byivVar3.d = i;
        byiuVar.copyOnWrite();
        byiv byivVar4 = (byiv) byiuVar.instance;
        str.getClass();
        byivVar4.b |= 4;
        byivVar4.e = str;
        byiuVar.copyOnWrite();
        byiv byivVar5 = (byiv) byiuVar.instance;
        byivVar5.b |= 8;
        byivVar5.f = i2;
        evvp evvpVarC = evxc.c(this.l.f().toEpochMilli());
        byiuVar.copyOnWrite();
        byiv byivVar6 = (byiv) byiuVar.instance;
        evvpVarC.getClass();
        byivVar6.i = evvpVarC;
        byivVar6.b |= 64;
        this.c.c((byiv) byiuVar.build());
    }
}
