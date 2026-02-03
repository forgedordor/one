package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amya {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;

    public amya(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    public final eiju a(MessageIdType messageIdType, FileInformation fileInformation, coqg coqgVar) {
        return ((cohh) this.d.b()).a().a(messageIdType, fileInformation, coqgVar.toByteString());
    }
}
