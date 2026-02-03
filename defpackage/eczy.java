package defpackage;

import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eczy implements eeva {
    final /* synthetic */ ArtEditActivity a;

    public eczy(ArtEditActivity artEditActivity) {
        this.a = artEditActivity;
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        ArtEditActivity artEditActivity = this.a;
        artEditActivity.s.a(dsvg.e(), eeveVar.i);
        artEditActivity.J.setDisplayedChild(eeveVar.e);
        edar edarVar = artEditActivity.w;
        int i = eeveVar.e;
        edarVar.b = i;
        boolean z = false;
        boolean z2 = i == 2;
        EditableArtView editableArtView = artEditActivity.G;
        editableArtView.i = z2;
        if (i != 1 && (i == 2 || edarVar.d != -1)) {
            z = true;
        }
        editableArtView.i = z;
        editableArtView.k(z);
    }

    @Override // defpackage.eeuz
    public final void c() {
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
    }
}
