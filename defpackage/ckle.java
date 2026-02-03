package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckle {
    public static final emqr a(ckmn ckmnVar) {
        ckmnVar.getClass();
        switch (ckmnVar) {
            case UNKNOWN:
            case UNRECOGNIZED:
                Objects.toString(ckmnVar);
                throw new IllegalArgumentException("Cannot log a reaction event with an unspecified surface: ".concat(ckmnVar.toString()));
            case REACTION_BAR:
                return emqr.CONVERSATION_VIEW_SELECTION_BAR;
            case CUSTOM_REACTION_PICKER:
                return emqr.CUSTOM_REACTION_SELECTION_EMOJI_PICKER;
            case DITTO_REACTION_BAR:
                return emqr.DITTO_CONVERSATION_VIEW_SELECTION_BAR;
            case REACTION_SUMMARY:
                return emqr.SUMMARY_VIEW_SELECTION_BAR;
            case EMOTIFY_CREATION:
                return emqr.EMOTIFY_REACTION_CREATION;
            case EMOTIFY_PICKER_SELF_OWNED:
                return emqr.EMOTIFY_PICKER_SELF_OWNED;
            case EMOTIFY_PICKER_AUTO_SAVED:
                return emqr.EMOTIFY_PICKER_AUTO_SAVED;
            case DOUBLE_TAP_TO_REACT:
                return emqr.DOUBLE_TAP_TO_REACT;
            case MEDIA_VIEWER_REACTION_PICKER:
                return emqr.MEDIA_VIEWER_REACTION_PICKER;
            default:
                throw new fctg();
        }
    }
}
