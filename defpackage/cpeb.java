package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cpeb {
    public static cpeb d(ConversationIdType conversationIdType, final cnqj cnqjVar) {
        return new cpdx(conversationIdType, new eygg() { // from class: cpea
            @Override // defpackage.eygg
            public final Object b() {
                return cnqjVar;
            }
        });
    }

    public abstract ConversationIdType a();

    public abstract eygg b();

    public final cnqj c() {
        return (cnqj) b().b();
    }
}
