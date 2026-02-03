package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.time.Duration;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andf implements AutoCloseable, andq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/OptimisticMessagePager");
    public final andq b;
    public final ancc c;
    public final fdjx d;
    public final andz e;
    public final anbb f;
    public final avad g;
    public final AtomicReference h;
    public final anej i;
    private final fcyh j;
    private final avae k;

    public andf(fcyh fcyhVar, avae avaeVar, anej anejVar, anbg anbgVar, arla arlaVar, andq andqVar, ancc anccVar) {
        List arrayList;
        this.j = fcyhVar;
        this.k = avaeVar;
        this.i = anejVar;
        this.b = andqVar;
        this.c = anccVar;
        fdjx fdjxVarB = fdjy.b(fcyhVar.plus(new fdmt(null)));
        this.d = fdjxVarB;
        if (arlaVar.a()) {
            BugleConversationId bugleConversationId = ((amdx) anccVar).k;
            bugleConversationId.getClass();
            if (anbgVar.a.containsKey(bugleConversationId)) {
                Object obj = anbgVar.a.get(bugleConversationId);
                obj.getClass();
                arrayList = (List) obj;
            } else {
                ArrayList arrayList2 = new ArrayList();
                anbgVar.a.put(bugleConversationId, arrayList2);
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList();
        }
        this.e = new andz(arrayList, arlaVar.a() ? anbgVar.b : new Object(), arlaVar.a() ? anbgVar.c : new AtomicLong(0L), new fdap() { // from class: ancy
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ajlt ajltVar = (ajlt) obj2;
                ajltVar.getClass();
                return this.a.c.ad(ajltVar.b(), ajltVar.o());
            }
        });
        this.f = new anbb(andqVar);
        Duration durationOfMillis = Duration.ofMillis(((Long) ames.d.e()).longValue());
        cogw cogwVar = (cogw) avaeVar.a.b();
        cogwVar.getClass();
        durationOfMillis.getClass();
        this.g = new avad(cogwVar, durationOfMillis);
        this.h = new AtomicReference(ands.a);
        auvw.k(fdjxVarB, null, null, new andb(this, null), 3);
    }

    @Override // defpackage.ajma
    public final ajly a(ajlt ajltVar) {
        ajltVar.getClass();
        andq andqVar = this.b;
        return new aneb(andqVar.a(ajltVar), this.e.a());
    }

    @Override // defpackage.ajma
    public final /* bridge */ /* synthetic */ ajly b(Integer num) {
        andz andzVar = this.e;
        num.intValue();
        return new aneb(this.b.b(num), andzVar.a());
    }

    @Override // defpackage.ajma
    public final cquc c(final ajlz ajlzVar) {
        boolean zAdd;
        final anbb anbbVar = this.f;
        synchronized (anbbVar.a) {
            zAdd = anbbVar.b.add(ajlzVar);
        }
        if (zAdd) {
            return new cquc() { // from class: anba
                @Override // defpackage.cquc
                public final void a() {
                    ajlz ajlzVar2 = ajlzVar;
                    anbb anbbVar2 = anbbVar;
                    synchronized (anbbVar2.a) {
                        anbbVar2.b.remove(ajlzVar2);
                    }
                }

                @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    cqub.a(this);
                }
            };
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.lang.AutoCloseable, defpackage.andq
    public final void close() {
        fdjy.e(this.d, null);
        this.f.close();
        ((anca) this.b).j();
    }

    @Override // defpackage.ajma
    public final eiju d(MessageId messageId) {
        messageId.getClass();
        eiju eijuVarD = this.b.d(messageId);
        eijuVarD.getClass();
        return eijuVarD;
    }

    @Override // defpackage.ajma
    public final eiju e(ajly ajlyVar, int i) {
        if (ajlyVar instanceof aneb) {
            return this.b.e(((aneb) ajlyVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r8 < (r7.a.size() / 2)) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // defpackage.ajma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju f(defpackage.ajly r13, int r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.andf.f(ajly, int):eiju");
    }

    @Override // defpackage.ajma
    public final eiju g(ajly ajlyVar, int i) {
        if (ajlyVar instanceof aneb) {
            return this.b.g(((aneb) ajlyVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    @Override // defpackage.ajma
    public final eiju h(MessageId messageId) {
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.d, eicg.a(fcyiVar), fdjzVar, new ande(null, this, messageId)));
    }

    @Override // defpackage.andq
    public final void k() {
    }
}
