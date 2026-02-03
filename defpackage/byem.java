package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byem {
    public final basd a;
    public final ejxr b;
    public final ejxr c;
    public final MessageIdType d;

    public byem(final byej byejVar, final MessageIdType messageIdType, final basd basdVar) {
        this.a = basdVar;
        this.d = messageIdType;
        this.b = ejxx.a(new ejxr() { // from class: byek
            @Override // defpackage.ejxr
            public final Object get() {
                return byejVar.b(basdVar);
            }
        });
        this.c = ejxx.a(new ejxr() { // from class: byel
            @Override // defpackage.ejxr
            public final Object get() {
                return byejVar.a(messageIdType);
            }
        });
    }
}
