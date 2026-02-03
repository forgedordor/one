package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwla implements cwmn {
    public final eygg a;
    public final TextView b;
    public cvuk c;
    private final fcsu d;

    public cwla(cssx cssxVar, eygg eyggVar, fcsu fcsuVar, ConversationMessageView conversationMessageView, ViewGroup viewGroup, final cpdw cpdwVar) {
        new AtomicReference();
        this.a = eyggVar;
        this.d = fcsuVar;
        cssxVar.b();
        TextView textView = (TextView) viewGroup.findViewById(R.id.message_text);
        this.b = textView;
        textView.setOnClickListener(conversationMessageView);
        new cpdw(viewGroup, R.id.message_subject_view_stub, R.id.subject_container, new cpdv() { // from class: cwkv
            @Override // defpackage.cpdv
            public final void a(Object obj) {
                View view = (View) obj;
            }
        });
        if (cpdwVar != null) {
            ((Optional) fcsuVar.b()).map(new Function() { // from class: cwkw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ahsu) obj).a(cpdwVar);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            Optional.empty();
        }
    }

    @Override // defpackage.cwmn
    public final boolean a(View view) {
        return view == this.b;
    }
}
