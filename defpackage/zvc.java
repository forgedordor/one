package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvc {
    public final Context a;
    public final fdjx b;
    public final fcsu c;
    public final zvl d;
    public final lwn e;
    public final dnvi f;
    public final dnwx g;
    public final dnuy h;
    public final fdpl i;
    public final abvd j;
    private final zvn k;
    private final ConversationId l;
    private final fdpl m;
    private final arqu n;
    private final fdpl o;

    public zvc(Context context, fdjx fdjxVar, fcsu fcsuVar, zvl zvlVar, zvn zvnVar, lwn lwnVar, ConversationId conversationId, fdpl fdplVar, arqu arquVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        fdpl fdpuVar;
        context.getClass();
        fdjxVar.getClass();
        zvnVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        optional.getClass();
        optional2.getClass();
        optional3.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = zvlVar;
        this.k = zvnVar;
        this.e = lwnVar;
        this.l = conversationId;
        this.m = fdplVar;
        this.n = arquVar;
        dnvi dnviVar = (dnvi) fdct.b(optional);
        this.f = dnviVar;
        this.j = (abvd) fdct.b(optional2);
        this.g = (dnwx) fdct.b(optional3);
        dnuy dnuyVar = (dnuy) fdct.b(optional4);
        this.h = dnuyVar;
        fdui fduiVar = new fdui(new zuw(this, null));
        this.o = fduiVar;
        if (!crbf.e() || dnviVar == null || dnuyVar == null) {
            fdpuVar = new fdpu(null);
        } else {
            fctc fctcVarA = fctd.a(new fdae() { // from class: zur
                @Override // defpackage.fdae
                public final Object invoke() {
                    zvc zvcVar = this.a;
                    return fdtg.a(zvcVar.f.e(), zvcVar.b, fdur.b, 1);
                }
            });
            if (!arquVar.a()) {
                fdua fduaVar = new fdua(fduiVar, fdplVar, new zuy(null));
                zvb zvbVar = new zvb(null, fctcVarA);
                int i = fdsn.a;
                fdpuVar = new fdwg(zvbVar, fduaVar);
            } else if (conversationId instanceof PenpalBotConversationId) {
                fdpuVar = new fdpu(null);
            } else {
                zva zvaVar = new zva(null, fctcVarA);
                int i2 = fdsn.a;
                fdpuVar = new fdwg(zvaVar, fduiVar);
            }
        }
        this.i = fdpuVar;
        if (crbf.e() && dnviVar != null && fdbq.f(lwnVar.b("has_pending_emotify_result"), true)) {
            auvw.k(fdjxVar, null, null, new zuu(this, null), 3);
        }
    }

    public static final fduj c(fctc fctcVar) {
        return (fduj) fctcVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.zuv
            if (r0 == 0) goto L13
            r0 = r6
            zuv r0 = (defpackage.zuv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zuv r0 = new zuv
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r6)
            goto L3f
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.fctl.b(r6)
            dnuy r6 = r5.h
            if (r6 == 0) goto L4a
            r0.c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L49
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r4) goto L4a
            r3 = r4
            goto L4a
        L49:
            return r1
        L4a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvc.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.adh r8, com.google.android.apps.messaging.shared.api.messaging.MessageId r9, defpackage.fdae r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.zux
            if (r0 == 0) goto L13
            r0 = r11
            zux r0 = (defpackage.zux) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            zux r0 = new zux
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r11)
            r6 = r10
            r10 = r9
            r9 = r6
            goto L68
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.fctl.b(r11)
            android.content.Intent r11 = r8.b
            r2 = 0
            if (r11 == 0) goto L52
            int r8 = r8.a
            r4 = -1
            if (r8 != r4) goto L46
            goto L47
        L46:
            r11 = r2
        L47:
            if (r11 == 0) goto L52
            java.lang.String r8 = "resultKey"
            android.os.Parcelable r8 = r11.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            goto L53
        L52:
            r8 = r2
        L53:
            if (r8 == 0) goto L9e
            dnvi r11 = r7.f
            if (r11 == 0) goto L6b
            r0.a = r9
            r0.b = r10
            r0.c = r8
            r0.f = r3
            java.lang.Object r11 = r11.b(r8, r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            r2 = r11
            dnvg r2 = (defpackage.dnvg) r2
        L6b:
            r6 = r2
            r2 = r9
            r9 = r6
            if (r9 == 0) goto L8b
            zvn r0 = r7.k
            angp r1 = defpackage.anhp.b(r9)
            ckmn r3 = defpackage.ckmn.EMOTIFY_CREATION
            ckmc r4 = defpackage.ckmc.ADD_REACTION
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)
            abvd r8 = r7.j
            if (r8 == 0) goto L87
            dnww r9 = defpackage.dnww.c
            r8.d(r9)
        L87:
            r10.invoke()
            goto La7
        L8b:
            java.util.Objects.toString(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Can't create sticker from "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        L9e:
            abvd r8 = r7.j
            if (r8 == 0) goto La7
            dnww r9 = defpackage.dnww.a
            r8.d(r9)
        La7:
            dnwx r8 = r7.g
            if (r8 == 0) goto Lae
            r8.a()
        Lae:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvc.b(adh, com.google.android.apps.messaging.shared.api.messaging.MessageId, fdae, fcxy):java.lang.Object");
    }
}
