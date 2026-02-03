package defpackage;

import android.animation.Animator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uph {
    public static final /* synthetic */ fdeh[] a;
    public final ConversationScrollToBottomButton b;
    public final ViewGroup c;
    public final TextView d;
    public final fctc e;
    public final fctc f;
    public final fctc g;
    public Animator h;
    public final fdcz i;
    private final Runnable j;

    static {
        fdbv fdbvVar = new fdbv(uph.class, "textMode", "getTextMode()Lcom/google/android/apps/messaging/conversation/scrolltobottombutton/ConversationScrollToBottomButtonPeer$TextMode;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public uph(fcsu fcsuVar, dair dairVar) {
        dairVar.getClass();
        Object objB = fcsuVar.b();
        objB.getClass();
        ConversationScrollToBottomButton conversationScrollToBottomButton = (ConversationScrollToBottomButton) objB;
        this.b = conversationScrollToBottomButton;
        View.inflate(conversationScrollToBottomButton.getContext(), R.layout.conversation_scroll_to_bottom_button, conversationScrollToBottomButton);
        View viewFindViewById = conversationScrollToBottomButton.findViewById(R.id.inner_root);
        viewFindViewById.getClass();
        this.c = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = conversationScrollToBottomButton.findViewById(R.id.text);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        conversationScrollToBottomButton.setClickable(true);
        this.j = new Runnable() { // from class: uou
            @Override // java.lang.Runnable
            public final void run() {
                uph uphVar = this.a;
                ConversationScrollToBottomButton conversationScrollToBottomButton2 = uphVar.b;
                conversationScrollToBottomButton2.setElevation(conversationScrollToBottomButton2.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_elevation));
                float elevation = conversationScrollToBottomButton2.getElevation() * 0.8f;
                float elevation2 = conversationScrollToBottomButton2.getElevation() * 0.8f;
                Rect rect = new Rect();
                Drawable background = uphVar.c.getBackground();
                InsetDrawable insetDrawable = background instanceof InsetDrawable ? (InsetDrawable) background : null;
                if (insetDrawable != null) {
                    insetDrawable.getPadding(rect);
                }
                conversationScrollToBottomButton2.setOutlineProvider(new upf(uphVar, rect, (int) elevation2, (int) elevation));
            }
        };
        d();
        this.e = fctd.a(new fdae() { // from class: uov
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_background_width_in_no_text_mode));
            }
        });
        this.f = fctd.a(new fdae() { // from class: uow
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_width));
            }
        });
        this.g = fctd.a(new fdae() { // from class: uox
            @Override // defpackage.fdae
            public final Object invoke() {
                return Integer.valueOf(this.a.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_height));
            }
        });
        this.i = new upg(upd.a, this);
        c();
    }

    public final upe a() {
        return (upe) this.i.c(a[0]);
    }

    public final String b(upc upcVar) {
        int i = upcVar.a;
        return qxq.b(this.b.getContext(), R.string.new_message_label, "count", Integer.valueOf(Math.min(0, 99)));
    }

    public final void c() {
        upe upeVarA = a();
        if (!(upeVarA instanceof upd)) {
            if (!(upeVarA instanceof upc)) {
                throw new fctg();
            }
            int i = ((upc) upeVarA).a;
        }
        ConversationScrollToBottomButton conversationScrollToBottomButton = this.b;
        conversationScrollToBottomButton.setContentDescription(qxq.b(conversationScrollToBottomButton.getContext(), R.string.conversation_scroll_to_bottom_button_content_description, "count", 0));
    }

    public final void d() {
        dair.a(this.c, this.j);
    }
}
