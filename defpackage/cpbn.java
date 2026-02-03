package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface cpbn {
    Uri a();

    Uri b(Uri uri, Uri uri2);

    RectF[] c(int i, int i2, int i3);

    Uri d(CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor);

    Uri e(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor);

    Uri f(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3);

    Uri g(Uri uri, CharSequence charSequence, alqm alqmVar, ParticipantColor participantColor, boolean z, boolean z2, boolean z3);

    Bitmap h(String str, int i, int i2, boolean z, boolean z2, Integer num, cpbm cpbmVar, boolean z3, boolean z4, boolean z5);

    Bitmap j(String str, String str2, int i, int i2, Integer num, cpbm cpbmVar, boolean z, OptionalInt optionalInt);

    Uri k(bvdz bvdzVar);
}
