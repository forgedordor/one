package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwqh extends rts {
    final /* synthetic */ SuggestionData b;
    final /* synthetic */ ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwqh(ImageView imageView, SuggestionData suggestionData, ImageView imageView2) {
        super(imageView);
        this.b = suggestionData;
        this.c = imageView2;
    }

    @Override // defpackage.rua
    public final void a(Drawable drawable) {
        cwqi.k.n("Suggestion icon failed to load for suggestion: ".concat(String.valueOf(cqcv.b(this.b.toString()))));
    }

    @Override // defpackage.rua
    public final /* bridge */ /* synthetic */ void b(Object obj, ruk rukVar) {
        this.c.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.rts
    protected final void c() {
    }
}
