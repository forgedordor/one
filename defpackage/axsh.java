package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsh {
    private final Context a;
    private final fcsu b;
    private final fcsu c;
    private final Optional d;

    public axsh(Context context, fcsu fcsuVar, fcsu fcsuVar2, Optional optional) {
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = optional;
    }

    final void a(Uri uri, MessageIdType messageIdType, ConversationIdType conversationIdType, int i, int i2, boolean z, boolean z2) {
        if (z) {
            if (i == 105) {
                uri.getClass();
                ((cmqj) this.c.b()).G(this.a, uri);
            } else if (i == 103) {
                i = 103;
                uri.getClass();
                ((cmqj) this.c.b()).G(this.a, uri);
            }
        }
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("MessageStatusUpdater#updateMessageStatus");
        brduVar.U(i);
        brduVar.B(i2);
        if (z2) {
            brduVar.v(false);
            brduVar.F(false);
        }
        ((baxe) this.b.b()).V(conversationIdType, messageIdType, brduVar);
        if (uri != null) {
            this.d.ifPresent(new Consumer() { // from class: axsg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((cdzq) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
