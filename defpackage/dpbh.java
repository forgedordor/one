package defpackage;

import com.google.android.libraries.compose.tenor.rest.MediaResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dpbh extends fdbo implements fdap {
    public dpbh(Object obj) {
        super(1, obj, dpbb.class, "gifFromMediaResult", "gifFromMediaResult(Lcom/google/android/libraries/compose/tenor/rest/MediaResult;)Lcom/google/android/libraries/compose/gif/data/GifMedia;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MediaResult mediaResult = (MediaResult) obj;
        mediaResult.getClass();
        return new dnyz(mediaResult.getId(), mediaResult.title(), mediaResult.getUrl(), dpbb.c(mediaResult.getMedia(), false), null, 16);
    }
}
