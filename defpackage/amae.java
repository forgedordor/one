package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amae implements ajmy {
    private static final ajmc c = new ajmc() { // from class: alzx
        @Override // defpackage.ajmc
        public final int d() {
            return 2;
        }
    };
    public final clpq a;
    public final MessagesTable.BindData b;
    private final ConversationId d;
    private final fctc e;
    private final fctc f = fctd.b(3, new fdae() { // from class: alzz
        @Override // defpackage.fdae
        public final Object invoke() {
            return new CoreBugleMessageId(this.a.b.E(), -1L);
        }
    });
    private final fctc g = fctd.b(3, new fdae() { // from class: amaa
        @Override // defpackage.fdae
        public final Object invoke() {
            return Instant.ofEpochMilli(this.a.b.w());
        }
    });
    private final fctc h = fctd.b(3, new fdae() { // from class: amab
        @Override // defpackage.fdae
        public final Object invoke() {
            return Instant.ofEpochMilli(this.a.b.z());
        }
    });
    private final fctc i = fctd.b(3, new fdae() { // from class: amac
        @Override // defpackage.fdae
        public final Object invoke() {
            return andv.a(this.a.b.m());
        }
    });
    private final fctc j = fctd.b(3, new fdae() { // from class: amad
        @Override // defpackage.fdae
        public final Object invoke() {
            return MessageData.ar(this.a.b.m());
        }
    });
    private final ajmc k = c;
    private final int n = 2;
    private final anpj l = new anpk(null);
    private final int o = 1;
    private final anpj m = new anpk(0);

    public amae(final amtw amtwVar, ConversationId conversationId, clpq clpqVar) {
        this.d = conversationId;
        this.a = clpqVar;
        this.b = clpqVar.a;
        this.e = fctd.b(3, new fdae() { // from class: alzy
            @Override // defpackage.fdae
            public final Object invoke() {
                ancl anclVarA;
                amae amaeVar = this;
                PartsTable.BindData[] bindDataArr = amaeVar.a.b;
                bindDataArr.getClass();
                ekgb ekgbVarC = ekfv.c(bindDataArr);
                String strR = amaeVar.r();
                if (strR != null) {
                    anck anckVarO = ancl.o();
                    ((anaq) anckVarO).d = strR;
                    anclVarA = anckVarO.a();
                } else {
                    anclVarA = ancl.n;
                }
                return amtwVar.a(amaeVar.b, ekgbVarC, anclVarA);
            }
        });
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ anms A() {
        return null;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ angj B() {
        return null;
    }

    @Override // defpackage.ajlt
    public final int C() {
        return this.n;
    }

    @Override // defpackage.ajlt
    public final int D() {
        return this.o;
    }

    @Override // defpackage.ajmy
    public final Instant E() {
        Instant instantM = this.a.c.m();
        instantM.getClass();
        return instantM;
    }

    @Override // defpackage.ajlt
    public final ajls a() {
        Object objA = this.i.a();
        objA.getClass();
        return (ajls) objA;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ MessageId b() {
        Object objA = this.f.a();
        objA.getClass();
        return (CoreBugleMessageId) objA;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ ajmb c() {
        return null;
    }

    @Override // defpackage.ajlt
    public final ajmc d() {
        return this.k;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ ajmx e() {
        return null;
    }

    @Override // defpackage.ajlt
    public final ConversationId f() {
        return this.d;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ amvr g() {
        Object objA = this.e.a();
        objA.getClass();
        return (amvr) objA;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ amwc h() {
        return null;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ angr i() {
        return null;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ anlb j() {
        return null;
    }

    @Override // defpackage.ajlt
    public final anpj k(int i) {
        int i2 = ekgb.d;
        return new anpk(ekoe.a);
    }

    @Override // defpackage.ajlt
    public final anpj l() {
        return this.m;
    }

    @Override // defpackage.ajlt
    public final anpj m() {
        return this.l;
    }

    @Override // defpackage.ajlt
    public final /* bridge */ /* synthetic */ eiju n() {
        throw new UnsupportedOperationException("This is not supported for scheduled messages");
    }

    @Override // defpackage.ajlt
    public final Instant o() {
        Object objA = this.g.a();
        objA.getClass();
        return (Instant) objA;
    }

    @Override // defpackage.ajlt
    public final Instant p() {
        Object objA = this.h.a();
        objA.getClass();
        return (Instant) objA;
    }

    @Override // defpackage.ajlt
    public final Long q() {
        long jB = this.b.B();
        if (jB == 0) {
            return null;
        }
        return Long.valueOf(jB);
    }

    @Override // defpackage.ajlt
    public final String r() {
        return this.a.f();
    }

    @Override // defpackage.ajlt
    public final String s() {
        Object objA = this.j.a();
        objA.getClass();
        return (String) objA;
    }

    @Override // defpackage.ajlt
    public final boolean t(aoer aoerVar) {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean u() {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean v(aoer aoerVar) {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean w() {
        return false;
    }

    @Override // defpackage.ajlt
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean y() {
        return false;
    }

    @Override // defpackage.ajlt
    public final boolean z() {
        return false;
    }
}
