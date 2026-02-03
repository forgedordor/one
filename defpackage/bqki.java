package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqki extends dqye {
    public bqki() {
        super("message_reactions");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqkh b() {
        ah();
        return new bqkh(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        String[] strArr = bqkl.a;
        bqkk bqkkVar = new bqkk();
        bqkkVar.b(messageIdType);
        aj(new bqkj(bqkkVar), "message_reactions-buildAndUpdateForMessageId");
    }

    public final void d() {
        this.a.putNull("animation_effect");
    }

    public final void e(cklv cklvVar) {
        if (cklvVar == null) {
            this.a.putNull("reactions_data");
        } else {
            this.a.put("reactions_data", cklvVar.toByteArray());
        }
    }

    public final void f(Function function) {
        String[] strArr = bqkl.a;
        af(new bqkj((bqkk) function.apply(new bqkk())));
    }
}
