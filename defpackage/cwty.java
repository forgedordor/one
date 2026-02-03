package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionContainerView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwty {
    public final View a;
    public final SuggestionData b;
    public ImageView c;
    protected final ehqu d;
    private TextView e;

    public cwty(Context context, SuggestionData suggestionData, View view) {
        this.a = view;
        this.b = suggestionData;
        this.d = ehqs.a(context).c();
    }

    protected static String g(String str, String str2) {
        return str2 == null ? str : a.q(str2, str, ": ");
    }

    public Optional a(int i) {
        return Optional.empty();
    }

    public String b() {
        return c();
    }

    public String c() {
        return this.b.a();
    }

    public final TextView d(int i) {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        TextView textView2 = (TextView) this.a.findViewById(i);
        this.e = textView2;
        return textView2;
    }

    public final ConversationSuggestionContainerView e() {
        View view = this.a;
        ejwl.a(view instanceof ConversationSuggestionContainerView);
        return (ConversationSuggestionContainerView) view;
    }

    protected final Optional f(Context context, int i, int i2, boolean z) {
        Drawable drawableMutate = context.getDrawable(i).mutate();
        if (z) {
            drawableMutate.setTint(i2);
        }
        return Optional.of(this.d.h(drawableMutate));
    }
}
