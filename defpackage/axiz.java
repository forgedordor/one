package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.MediaScratchFileProvider;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axiz extends bxlf {

    /* compiled from: PG */
    public interface a {
        chud ci();
    }

    private final boolean k() {
        return ((a) ehli.a(getContext(), a.class)).ci().a(Binder.getCallingUid());
    }

    @Override // defpackage.bxlf, defpackage.bxld
    protected final File a(String str, String str2) {
        if (k()) {
            return super.a(str, str2);
        }
        ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
        ekrwVarJ.X(eksq.a, "BugleRcsEngine");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getFile", 61, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (k()) {
            return super.delete(uri, str, strArr);
        }
        ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
        ekrwVarJ.X(eksq.a, "BugleRcsEngine");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "delete", 85, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return 0;
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final String getType(Uri uri) {
        if (!k()) {
            ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
            ekrwVarJ.X(eksq.a, "BugleRcsEngine");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "getType", 137, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        if (!k()) {
            ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
            ekrwVarJ.X(eksq.a, "BugleRcsEngine");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "insert", 114, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return null;
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (k()) {
            if (true == "w".equals(str)) {
                str = "wt";
            }
            return super.openFile(uri, str);
        }
        ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
        ekrwVarJ.X(eksq.a, "BugleRcsEngine");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "openFile", 97, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.bxlf, defpackage.bxld, android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (k()) {
            return super.query(uri, strArr, str, strArr2, str2);
        }
        ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
        ekrwVarJ.X(eksq.a, "BugleRcsEngine");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, 74, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        return null;
    }

    @Override // defpackage.bxld, android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!k()) {
            ekrw ekrwVarJ = MediaScratchFileProvider.a.j();
            ekrwVarJ.X(eksq.a, "BugleRcsEngine");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/MediaScratchFileProvider$MediaScratchFileProviderInternal", "update", 125, "MediaScratchFileProvider.java")).q("Calling package is not whitelisted.");
        }
        return 0;
    }
}
