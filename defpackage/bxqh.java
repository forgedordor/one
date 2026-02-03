package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqh implements bxqj {
    private static final cqce f = cqce.g("BugleDataModel", "RichCardMessagePartMediaDownloadHandler");
    public final dqsn a;
    public final ConversationIdType b;
    public final MessageIdType c;
    public final String d;
    public final fcsu e;
    private final eosc g;
    private final bxqa h;

    public bxqh(eosc eoscVar, fcsu fcsuVar, dqsn dqsnVar, bxqa bxqaVar, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        this.g = eoscVar;
        this.e = fcsuVar;
        this.a = dqsnVar;
        this.h = bxqaVar;
        this.b = conversationIdType;
        this.c = messageIdType;
        this.d = str;
    }

    @Override // defpackage.bxqj
    public final void a(String str) {
        cqbd cqbdVarC = f.c();
        cqbdVarC.I("Media download cancelled");
        cqbdVarC.A("requestedUri", str);
        cqbdVarC.r();
    }

    @Override // defpackage.bxqj
    public final void b(String str) {
        cqbd cqbdVarB = f.b();
        cqbdVarB.I("Media download failed");
        cqbdVarB.A("requestedUri", str);
        cqbdVarB.r();
        auvh.h(eijx.g(new Callable() { // from class: bxqe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final bxqh bxqhVar = this.a;
                return (Boolean) bxqhVar.a.c("RichCardMessagePartMediaDownloadHandler#onFailure", new ejxr() { // from class: bxqg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = PartsTable.a;
                        bsjh bsjhVar = new bsjh();
                        bsjhVar.x(bvdy.PERMANENT_ERROR);
                        return Boolean.valueOf(bsjhVar.c(bxqhVar.d));
                    }
                });
            }
        }, this.g));
    }

    @Override // defpackage.bxqj
    public final void c(String str, long j, long j2) {
        CoreBuglePartialMessageId coreBuglePartialMessageId = new CoreBuglePartialMessageId(this.c, Long.parseLong(this.d));
        cohi cohiVar = new cohi();
        cohiVar.b(j);
        cohiVar.c(j2);
        coik coikVarD = cohiVar.d();
        bxqa bxqaVar = this.h;
        auvw.k(bxqaVar.b, null, null, new bxpz(bxqaVar, coreBuglePartialMessageId, coikVarD, null), 3);
    }

    @Override // defpackage.bxqj
    public final void d(String str) {
        cqbd cqbdVarC = f.c();
        cqbdVarC.I("Media download started");
        cqbdVarC.A("requestedUri", str);
        cqbdVarC.y("handlerHashCode", hashCode());
        cqbdVarC.r();
        auvh.h(eijx.g(new Callable() { // from class: bxqc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final bxqh bxqhVar = this.a;
                return (Boolean) bxqhVar.a.c("RichCardMessagePartMediaDownloadHandler#onStart", new ejxr() { // from class: bxqf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = PartsTable.a;
                        bsjh bsjhVar = new bsjh();
                        bsjhVar.x(bvdy.NONE);
                        return Boolean.valueOf(bsjhVar.c(bxqhVar.d));
                    }
                });
            }
        }, this.g));
    }

    @Override // defpackage.bxqj
    public final void e(String str, final Uri uri) {
        cqbd cqbdVarC = f.c();
        cqbdVarC.I("Updating media part with local");
        cqbdVarC.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        cqbdVarC.I("and preview");
        cqbdVarC.r();
        auvh.h(eijx.f(new Runnable() { // from class: bxqb
            @Override // java.lang.Runnable
            public final void run() {
                final bxqh bxqhVar = this.a;
                final Uri uri2 = uri;
                bxqhVar.a.d("UpdateMessagePartUri", new Runnable() { // from class: bxqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        bxqh bxqhVar2 = bxqhVar;
                        ((bbae) bxqhVar2.e.b()).i(bxqhVar2.b, bxqhVar2.c, bxqhVar2.d, uri2);
                    }
                });
            }
        }, this.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxqh)) {
            return false;
        }
        bxqh bxqhVar = (bxqh) obj;
        return Objects.equals(this.b, bxqhVar.b) && Objects.equals(this.c, bxqhVar.c) && Objects.equals(this.d, bxqhVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d);
    }
}
