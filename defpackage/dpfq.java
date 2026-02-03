package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.text.InputFilter;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfq extends dpfs {
    static final /* synthetic */ fdeh[] a;
    private static final ekrg s;
    public final kbi b;
    public dniv c;
    public dpir d;
    public kio e;
    public final fdcz f;
    public final fdcz g;
    public final fdcz h;
    public final fdcz i;
    public final fdcz j;
    public final fdcz k;
    public final fdcz l;
    public InputFilter.LengthFilter m;
    public final fdcz n;
    public boolean o;
    public boolean p;
    public final fdcz q;
    public final fdcz r;
    private final fctc t;
    private boolean u;

    static {
        fdbv fdbvVar = new fdbv(dpfq.class, "textStyle", "getTextStyle$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/text/TextStyle;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dpfq.class, "layoutDirection", "getLayoutDirection$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/unit/LayoutDirection;", 0), new fdbv(dpfq.class, "keyboardOptions", "getKeyboardOptions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardOptions;", 0), new fdbv(dpfq.class, "keyboardActions", "getKeyboardActions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardActions;", 0), new fdbv(dpfq.class, "verticalPadding", "getVerticalPadding-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new fdbv(dpfq.class, "minHeight", "getMinHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new fdbv(dpfq.class, "maxHeight", "getMaxHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new fdbv(dpfq.class, "maxLength", "getMaxLength$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Integer;", 0), new fdbv(dpfq.class, "placeholder", "getPlaceholder$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Lcom/google/android/libraries/compose/ui/composable/text/TextPlaceholder;", 0), new fdbv(dpfq.class, "hasExplicitFocus", "getHasExplicitFocus$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Boolean;", 0)};
        s = ekrg.c("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfq(Context context, kbi kbiVar) {
        super(context);
        kbiVar.getClass();
        this.b = kbiVar;
        this.t = fctd.a(new fdae() { // from class: dpff
            @Override // defpackage.fdae
            public final Object invoke() {
                dpfq dpfqVar = this.a;
                dniv dnivVar = dpfqVar.c;
                if (dnivVar == null) {
                    fdbq.c("draftControllerFactory");
                    dnivVar = null;
                }
                dniv dnivVar2 = dnivVar;
                dnga dngaVar = (dnga) dnivVar.a.b();
                dnji dnjiVar = (dnji) dnivVar2.b.b();
                dnjiVar.getClass();
                dnje dnjeVar = (dnje) dnivVar2.c.b();
                dnjeVar.getClass();
                dngc dngcVar = (dngc) dnivVar2.d.b();
                dngcVar.getClass();
                return new dniu(dngaVar, dnjiVar, dnjeVar, dngcVar, dpfqVar);
            }
        });
        this.f = new dpfh(jyq.a, this);
        this.g = new dpfi(this);
        this.h = new dpfj(fae.a, this);
        this.i = new dpfk(fad.a, this);
        this.j = new dpfl(new kir(Float.NaN), this);
        this.k = new dpfm(new kir(Float.NaN), this);
        this.l = new dpfn(new kir(Float.NaN), this);
        this.n = new dpfo(this);
        this.q = new dpfp(this);
        this.r = new dpfg(this);
    }

    public final kio d() {
        kio kioVar = this.e;
        if (kioVar != null) {
            return kioVar;
        }
        fdbq.c("density");
        return null;
    }

    public final dniu e() {
        return (dniu) this.t.a();
    }

    public final dpir f() {
        dpir dpirVar = this.d;
        if (dpirVar != null) {
            return dpirVar;
        }
        fdbq.c("keyboardManager");
        return null;
    }

    public final Boolean g() {
        return (Boolean) this.r.c(a[9]);
    }

    public final void h() {
        dpjd dpjdVarF = f().f();
        if (dpjdVarF == dpjd.a || dpjdVarF == dpjd.b) {
            f().g(this, true);
        }
    }

    public final void i() {
        dpjd dpjdVarF = f().f();
        if (dpjdVarF == dpjd.d || dpjdVarF == dpjd.c) {
            f().h(this, false);
        }
    }

    @Override // defpackage.lox, defpackage.qx, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        inputConnectionOnCreateInputConnection.getClass();
        if (!fdbq.f(g(), true)) {
            if (fdbq.f(g(), false)) {
                h();
            }
            return inputConnectionOnCreateInputConnection;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        i();
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (!this.p) {
            super.onDraw(canvas);
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.u) {
                ekrd ekrdVar = (ekrd) s.j();
                ekrdVar.Z(eksk.FULL);
                ((ekrd) ekrdVar.h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 363, "HugoEmojiTextField.kt")).q("Recovered from NPE");
                this.u = false;
            }
        } catch (NullPointerException e) {
            this.u = true;
            if (getLayout() == null && getHint() == null) {
                ((ekrd) ((ekrd) s.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 369, "HugoEmojiTextField.kt")).q("null hint & layout");
                return;
            }
            if (getLayout() != null && getHint() == null) {
                ((ekrd) ((ekrd) s.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 370, "HugoEmojiTextField.kt")).q("null hint");
                return;
            }
            if (getLayout() == null && getHint() != null) {
                ((ekrd) ((ekrd) s.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 371, "HugoEmojiTextField.kt")).q("null layout");
            } else {
                if (getLayout() == null || getHint() == null) {
                    return;
                }
                ((ekrd) ((ekrd) s.i()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 372, "HugoEmojiTextField.kt")).q("No null");
            }
        }
    }

    @Override // defpackage.qx, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            if (this.o) {
                return super.onTextContextMenuItem(R.id.pasteAsPlainText);
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }
}
