package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atul extends fcyz implements fdat {
    int a;
    final /* synthetic */ atuo b;
    final /* synthetic */ atrj c;
    final /* synthetic */ audr d;
    final /* synthetic */ Uri e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atul(fcxy fcxyVar, atuo atuoVar, atrj atrjVar, audr audrVar, Uri uri) {
        super(2, fcxyVar);
        this.b = atuoVar;
        this.c = atrjVar;
        this.d = audrVar;
        this.e = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atul) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Lb
            goto Le6
        Lb:
            java.lang.Object r11 = r10.f
            fdjx r11 = (defpackage.fdjx) r11
            atuo r11 = r10.b
            fcsu r1 = r11.a
            java.lang.Object r1 = r1.b()
            bakt r1 = (defpackage.bakt) r1
            atrj r2 = r10.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r2.f()
            r1.P(r3)
            audr r1 = r10.d
            j$.util.Optional r3 = r2.j()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L35
            int r3 = r2.a()
            r4 = 4
            if (r3 != r4) goto L50
        L35:
            aufb r3 = r1.e
            if (r3 != 0) goto L3b
            aufb r3 = defpackage.aufb.a
        L3b:
            aufb r4 = defpackage.aufb.a
            evsf r4 = r4.createBuilder()
            aufa r4 = (defpackage.aufa) r4
            r4.getClass()
            aufb r4 = defpackage.aufc.a(r4)
            boolean r3 = defpackage.fdbq.f(r3, r4)
            if (r3 != 0) goto Le6
        L50:
            boolean r3 = r1.f
            if (r3 != 0) goto Le6
            fcsu r11 = r11.b
            java.lang.Object r11 = r11.b()
            r4 = r11
            byeb r4 = (defpackage.byeb) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r2.f()
            aufb r11 = r1.e
            if (r11 != 0) goto L67
            aufb r11 = defpackage.aufb.a
        L67:
            aubq r11 = r11.c
            if (r11 != 0) goto L6d
            aubq r11 = defpackage.aubq.a
        L6d:
            r11.getClass()
            java.lang.String r1 = r11.d
            r1.getClass()
            int r1 = r1.length()
            r9 = 1
            if (r1 != 0) goto L7e
            r11 = 0
            goto Lad
        L7e:
            bsbo r1 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.e()
            java.lang.String r3 = "RcsGroupIconUpdater.getOriginatorParticipant"
            r1.A(r3)
            atuk r3 = new atuk
            r3.<init>()
            r1.h(r3)
            bsbl[] r11 = new defpackage.bsbl[r9]
            brzh r3 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.c
            brzi r3 = r3.d
            bsbl r6 = new bsbl
            r7 = 0
            r6.<init>(r3, r7)
            r11[r7] = r6
            r1.d(r11)
            r1.y(r9)
            bsbm r11 = r1.b()
            dqpd r11 = r11.l()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r11 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData) r11
        Lad:
            r7 = r11
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r11 = r2.b()
            axcy r6 = r2.e()
            android.net.Uri r1 = r10.e
            android.net.Uri r2 = android.net.Uri.EMPTY
            boolean r1 = defpackage.fdbq.f(r1, r2)
            if (r9 == r1) goto Lc3
            r1 = 260(0x104, float:3.64E-43)
            goto Lc5
        Lc3:
            r1 = 261(0x105, float:3.66E-43)
        Lc5:
            r8 = r1
            fcsu r1 = r4.m
            java.lang.Object r1 = r1.b()
            aofc r1 = (defpackage.aofc) r1
            eiju r11 = r1.e(r11)
            bydq r3 = new bydq
            r3.<init>()
            eosc r1 = r4.n
            eiju r11 = r11.h(r3, r1)
            r10.a = r9
            java.lang.Object r11 = defpackage.fdxs.c(r11, r10)
            if (r11 != r0) goto Le6
            return r0
        Le6:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atul.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atul atulVar = new atul(fcxyVar, this.b, this.c, this.d, this.e);
        atulVar.f = obj;
        return atulVar;
    }
}
