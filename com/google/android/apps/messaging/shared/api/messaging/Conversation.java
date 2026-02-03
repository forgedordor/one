package com.google.android.apps.messaging.shared.api.messaging;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.amkd;
import defpackage.anpj;
import defpackage.cdfg;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface Conversation extends Parcelable, AutoCloseable {
    ajlu a();

    ajlw b();

    ajmh c();

    @Override // java.lang.AutoCloseable
    void close();

    ConversationId d();

    amkd e();

    anpj f();

    anpj g();

    anpj h();

    anpj i();

    cdfg j();

    void k();
}
