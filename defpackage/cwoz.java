package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwoz extends cwqi {
    public cwoz(Context context, cqmb cqmbVar, acgu acguVar, crba crbaVar, crqv crqvVar, ajhd ajhdVar, cogw cogwVar, fcsu fcsuVar, aykm aykmVar, eygg eyggVar, cwtz cwtzVar, eigp eigpVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        super(context, cqmbVar, acguVar, crbaVar, crqvVar, ajhdVar, cogwVar, fcsuVar, aykmVar, cwtzVar, eyggVar, eigpVar, fcsuVar2, fcsuVar3);
    }

    @Override // defpackage.cwqi
    public final int a() {
        return ((Boolean) ((cczi) cwpa.a.get()).e()).booleanValue() ? R.dimen.rich_card_conversation_suggestion_button_horizontal_padding : R.dimen.rich_card_conversation_suggestion_horizontal_padding;
    }

    @Override // defpackage.cwqi
    protected final int b() {
        return R.id.suggestion_rich_card_button_icon;
    }

    @Override // defpackage.cwqi
    protected final int c() {
        return R.id.suggestion_rich_card_button_label;
    }

    @Override // defpackage.cwqi
    protected final void d(cwty cwtyVar, cwtb cwtbVar) {
        super.d(cwtyVar, cwtbVar);
        if (((Boolean) ((cczi) cwpa.a.get()).e()).booleanValue()) {
            cwtyVar.e().a();
        }
    }

    @Override // defpackage.cwqi
    protected final int e() {
        return 0;
    }

    @Override // defpackage.cwqi
    protected final int f() {
        return 0;
    }
}
