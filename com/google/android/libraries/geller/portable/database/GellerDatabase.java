package com.google.android.libraries.geller.portable.database;

import defpackage.ekhx;
import defpackage.ekph;
import defpackage.ewae;
import defpackage.ewbc;
import defpackage.ewut;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface GellerDatabase {
    public static final ekhx a = new ekph(ewut.HERON.name());
    public static final ekhx b = ekhx.v(ewut.GDD_AAE_SMART_ACTION_MODELS.name(), ewut.GDD_AGSA_APA_CONTACT.name(), ewut.GDD_AGSA_APA_ROADWAY_RECAP_MODELS.name(), ewut.GDD_AGSA_APA_SUMMARIZE.name(), ewut.GDD_AGSA_APA_TCLIB_PERSON_NAME.name(), ewut.GDD_AGSA_APA_TEST_GROUP.name(), ewut.GDD_AGSA_APA_TEXT_CLASSIFIER.name(), ewut.GDD_AGSA_GROWTH_TRACKING.name(), ewut.GDD_AGSA_UNIFIED_MIC.name(), ewut.GDD_AIP_TOAST_QUALITY.name(), ewut.GDD_ANDROID_AUTOFILL_FIELD_PREDICTIONS.name(), ewut.GDD_ANDROID_AUTOFILL_VCN_MERCHANT_OPT_OUT.name(), ewut.GDD_APA_ARC_POP_NLU_MODELS.name(), ewut.GDD_APA_BISTO.name(), ewut.GDD_APA_BISTO_DEVICE_CUSTOMIZE_INFO.name(), ewut.GDD_APA_CORRECTIONS.name(), ewut.GDD_APA_DICTATION_FORMATTING.name(), ewut.GDD_APA_GENIE_FM.name(), ewut.GDD_APA_HEAD_SUGGEST.name(), ewut.GDD_APA_HOTMATCH.name(), ewut.GDD_APA_HOTWORD_MODEL.name(), ewut.GDD_APA_LIGHTWEIGHT_TOKENS.name(), ewut.GDD_APA_POP.name(), ewut.GDD_APA_RIOD.name(), ewut.GDD_APA_SMART_ACTION_MODELS.name(), ewut.GDD_APA_TELEPORT.name(), ewut.GDD_APA_UCM_TFL.name(), ewut.GDD_APA_WARMACTIONS.name(), ewut.GDD_ASSISTANT_AUTO_EMBEDDED_POP.name(), ewut.GDD_BUGLE_DATA_DOWNLOAD.name(), ewut.GDD_BUGLE_EMOJIFY.name(), ewut.GDD_BUGLE_SMARTS.name(), ewut.GDD_BUGLE_SUMMARIZATION.name(), ewut.GDD_CAMERA_FEATURE_COMBINATION_QUERY_GDD.name(), ewut.GDD_CAST_DEVICECONFIGS.name(), ewut.GDD_CUSTOMIZATIONBUNDLE_THEMEPACK.name(), ewut.GDD_FILES_OCR_ML_MODEL.name(), ewut.GDD_GOOGLE_PLAY_BOOKS_ANDROID_READING_PRACTICE_SOUND_OUT.name(), ewut.GDD_LENS_AVS.name(), ewut.GDD_LENS_EDU.name(), ewut.GDD_LENS_INPAINTING.name(), ewut.GDD_LENS_OFFLINE_TEXT.name(), ewut.GDD_LENS_RAID.name(), ewut.GDD_LENS_SCENE_X.name(), ewut.GDD_LENS_SEGMENTATION.name(), ewut.GDD_LENS_TEXT.name(), ewut.GDD_LENS_TEXT_CLASSIFIER.name(), ewut.GDD_NGA_GENIE_FM.name(), ewut.GDD_ODLH_FA_REGIONS.name(), ewut.GDD_PIXELCARE_AGENT_RESOURCES.name(), ewut.GDD_PIXELMERLIN_MODELS.name(), ewut.GDD_SBG_SPEECH_MODEL_DOWNLOAD.name(), ewut.GDD_SCONE_UE_CAPA_DOWNLOADER.name(), ewut.GDD_SPEECH_DSP_HOTWORD_MODEL.name(), ewut.GDD_TR_DICTIONARY.name(), ewut.GDD_TR_NMT.name(), ewut.GDD_TR_TRANSLITERATION.name(), ewut.GDD_WALLET_ISSUER_LOCATION.name(), ewut.GDD_WALLET_OCR_IMAGE_PASSES.name(), ewut.GDD_WEBREF.name(), ewut.GDD_WEBREF_NGA.name(), ewut.GDD_WELLBEING_INTELLIGENCE.name());

    long a(String str, ewbc ewbcVar);

    Map b();

    void c();

    long delete(String str);

    long delete(String str, byte[] bArr);

    long deleteMetadata(String str, String str2);

    byte[] getCorpusStats();

    byte[] getCorpusStats(String[] strArr);

    byte[] getSnapshot(String[] strArr, int i, boolean z);

    long markSyncStatus(String str, byte[] bArr);

    byte[][] read(String str, boolean z, boolean z2);

    byte[][] read(String str, byte[] bArr);

    byte[][] readAll(String str);

    String[] readDatabaseInfo(String str);

    byte[][] readElementIds(String str, byte[] bArr);

    String[] readKeys(String str);

    String[] readMetadata(String str, String str2);

    byte[] readMetadataForAllCorpora(String str);

    byte[][] readOutdatedData(String str);

    long setDeletionProcessed(byte[] bArr);

    long softDelete(String str, ewae ewaeVar);

    long softDelete(String str, byte[] bArr);

    boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr);

    byte[] write(byte[] bArr);

    boolean writeMetadata(String str, String str2, String str3);

    byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr);
}
