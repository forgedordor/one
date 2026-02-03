package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atjs {
    public static final emwm a(atjr atjrVar) {
        emwm emwmVar;
        atjrVar.getClass();
        switch (atjrVar.ordinal()) {
            case 0:
                emwmVar = emwm.PROCESSING_STEP_PRE_WARM;
                break;
            case 1:
                emwmVar = emwm.PROCESSING_STEP_AWAITING_SENDING;
                break;
            case 2:
                emwmVar = emwm.PROCESSING_STEP_FILE_RESIZING;
                break;
            case 3:
                emwmVar = emwm.PROCESSING_STEP_THUMBNAIL_RESIZING;
                break;
            case 4:
                emwmVar = emwm.PROCESSING_STEP_FILE_ENCRYPTION;
                break;
            case 5:
                emwmVar = emwm.PROCESSING_STEP_THUMBNAIL_ENCRYPTION;
                break;
            case 6:
                emwmVar = emwm.PROCESSING_STEP_UPLOAD;
                break;
            case 7:
                emwmVar = emwm.PROCESSING_STEP_SERIALIZE;
                break;
            case 8:
                emwmVar = emwm.PROCESSING_STEP_SEND;
                break;
            case 9:
                emwmVar = emwm.PROCESSING_STEP_NO_OP;
                break;
            case 10:
                emwmVar = emwm.PROCESSING_STEP_FILE_AND_THUMBNAIL_COMBINER;
                break;
            case 11:
                emwmVar = emwm.PROCESSING_STEP_SEQUENTIAL_PIPELINE;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(atjrVar.toString()));
        }
        emwmVar.getClass();
        return emwmVar;
    }
}
