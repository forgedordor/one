package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acji extends acjn {
    private ekfw a;
    private ekgb b;
    private SpannableString c;
    private ConversationIdType d;

    @Override // defpackage.acjn
    public final acjp a() {
        ConversationIdType conversationIdType;
        ekfw ekfwVar = this.a;
        if (ekfwVar != null) {
            this.b = ekfwVar.g();
        } else if (this.b == null) {
            int i = ekgb.d;
            this.b = ekoe.a;
        }
        SpannableString spannableString = this.c;
        if (spannableString != null && (conversationIdType = this.d) != null) {
            return new acjj(this.b, spannableString, conversationIdType);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" conversationName");
        }
        if (this.d == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.acjn
    public final ekfw b() {
        if (this.a == null) {
            if (this.b == null) {
                int i = ekgb.d;
                this.a = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.a = ekfwVar;
                ekfwVar.j(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.acjn
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.d = conversationIdType;
    }

    @Override // defpackage.acjn
    public final void d(SpannableString spannableString) {
        if (spannableString == null) {
            throw new NullPointerException("Null conversationName");
        }
        this.c = spannableString;
    }
}
