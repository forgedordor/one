package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wre {
    public final fdvc a;
    private final fduf b;

    public wre() {
        fduf fdufVarA = fdvf.a(new vvw((String) null, (List) null, (String) null, false, (MessageId) null, (EditingData) null, (Instant) null, false, 0, false, 2047));
        this.b = fdufVarA;
        this.a = fdufVarA;
    }

    public final vvw a(fdap fdapVar) {
        fduf fdufVar;
        Object objC;
        do {
            fdufVar = this.b;
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, fdapVar.invoke(objC)));
        return (vvw) objC;
    }

    public final vvw b(fdap fdapVar) {
        fduf fdufVar;
        Object objC;
        Object objInvoke;
        do {
            fdufVar = this.b;
            objC = fdufVar.c();
            objInvoke = fdapVar.invoke(objC);
        } while (!fdufVar.g(objC, objInvoke));
        return (vvw) objInvoke;
    }

    public final void c(fdap fdapVar) {
        fduf fdufVar;
        Object objC;
        do {
            fdufVar = this.b;
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, fdapVar.invoke(objC)));
    }
}
