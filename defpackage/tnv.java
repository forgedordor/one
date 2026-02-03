package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class tnv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmsp apply(cdyt cdytVar) {
        switch (cdytVar) {
            case UNSPECIFIED_DELETION:
                return bmsp.a;
            case TOOLSTONE_DELETION:
                return bmsp.b;
            case MESSAGE_NOT_DELIVERED_WEAR_DELETION:
                return bmsp.c;
            case MESSAGE_NOT_DELIVERED_PHONE_DELETION:
                return bmsp.e;
            case RICH_CARD_DELETION:
                return bmsp.d;
            case EXTERNAL_API_DELETION:
                return bmsp.g;
            case MESSAGE_LIST_MANUAL_DELETION:
                return bmsp.f;
            case MESSAGE_LIST_CONVO_V2_MANUAL_DELETION:
                return bmsp.h;
            case METATEXT_MESSAGE_MANUAL_DELETION:
                return bmsp.j;
            case EMERGENCY_MESSAGE_MANUAL_DELETION:
                return bmsp.i;
            case OTP_DELETION:
                return bmsp.k;
            case OBJECT_EVENT_TACHYON_DELETION:
                return bmsp.l;
            case DUPLICATE_MESSAGE_RESTORE_DELETION:
                return bmsp.m;
            case DITTO_DELETION:
                return bmsp.n;
            case ATT_CLOUD_SYNC_DELETION:
                return bmsp.o;
            case SET_PROTOCOL_CHANGE_TOMBSTONE_DELETION:
                return bmsp.p;
            case AFTER_MESSAGE_MOVE_TOMBSTONE_DELETION:
                return bmsp.q;
            case PREVIOUS_TOMBSTONE_DELETION:
                return bmsp.r;
            case UPDATE_CONVERSATION_CREATION_TOMBSTONE_DELETION:
                return bmsp.s;
            case INSERT_OR_UPDATE_AT_BOTTOM_TOMBSTONE_DELETION:
                return bmsp.t;
            case UNRECOGNIZED:
                return b();
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(cdytVar))));
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract bmsp b();

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
