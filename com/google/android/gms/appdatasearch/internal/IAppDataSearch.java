package com.google.android.gms.appdatasearch.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.sgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAppDataSearch extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppDataSearch {
        static final int TRANSACTION_blockPackages = 16;
        static final int TRANSACTION_clearUsageReportData = 33;
        static final int TRANSACTION_diagnostic = 9;
        static final int TRANSACTION_getAllCorpusNames = 27;
        static final int TRANSACTION_getCorpusHandlesRegisteredForIME = 22;
        static final int TRANSACTION_getCorpusInfo = 25;
        static final int TRANSACTION_getCorpusNames = 6;
        static final int TRANSACTION_getCorpusStatus = 5;
        static final int TRANSACTION_getCurrentExperimentIds = 31;
        static final int TRANSACTION_getDocuments = 3;
        static final int TRANSACTION_getGlobalSearchApps = 29;
        static final int TRANSACTION_getIMEUpdates = 23;
        static final int TRANSACTION_getNativeApiInfo = 34;
        static final int TRANSACTION_getPendingExperimentIds = 32;
        static final int TRANSACTION_getPhraseAffinity = 24;
        static final int TRANSACTION_getStorageStatistics = 28;
        static final int TRANSACTION_getUniversalSearchableApps = 13;
        static final int TRANSACTION_query = 1;
        static final int TRANSACTION_queryUniversal = 10;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_registerCorpusInfo2 = 14;
        static final int TRANSACTION_registerIME = 20;
        static final int TRANSACTION_registerUniversalSearchableApp = 11;
        static final int TRANSACTION_reportResultClick = 19;
        static final int TRANSACTION_requestIndexing = 4;
        static final int TRANSACTION_setExperimentIds = 30;
        static final int TRANSACTION_setIncludeInGlobalSearch = 36;
        static final int TRANSACTION_suggest = 2;
        static final int TRANSACTION_triggerCompaction = 18;
        static final int TRANSACTION_unblockPackages = 17;
        static final int TRANSACTION_unregister = 8;
        static final int TRANSACTION_unregisterIME = 21;
        static final int TRANSACTION_unregisterUniversalSearchableApp = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void blockPackages(String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean clearUsageReportData(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(33, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle diagnostic(Bundle bundle, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, bundle);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(9, parcelObtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getAllCorpusNames(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(27, parcelObtainAndWriteInterfaceToken);
                String[] strArrCreateStringArray = parcelTransactAndReadException.createStringArray();
                parcelTransactAndReadException.recycle();
                return strArrCreateStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusHandlesRegisteredForIME(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(22, parcelObtainAndWriteInterfaceToken);
                String[] strArrCreateStringArray = parcelTransactAndReadException.createStringArray();
                parcelTransactAndReadException.recycle();
                return strArrCreateStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public RegisterCorpusInfo getCorpusInfo(String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(25, parcelObtainAndWriteInterfaceToken);
                RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) sgh.a(parcelTransactAndReadException, RegisterCorpusInfo.CREATOR);
                parcelTransactAndReadException.recycle();
                return registerCorpusInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusNames(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(6, parcelObtainAndWriteInterfaceToken);
                String[] strArrCreateStringArray = parcelTransactAndReadException.createStringArray();
                parcelTransactAndReadException.recycle();
                return strArrCreateStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public CorpusStatus getCorpusStatus(String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
                CorpusStatus corpusStatus = (CorpusStatus) sgh.a(parcelTransactAndReadException, CorpusStatus.CREATOR);
                parcelTransactAndReadException.recycle();
                return corpusStatus;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getCurrentExperimentIds(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(31, parcelObtainAndWriteInterfaceToken);
                int[] iArrCreateIntArray = parcelTransactAndReadException.createIntArray();
                parcelTransactAndReadException.recycle();
                return iArrCreateIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, querySpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
                DocumentResults documentResults = (DocumentResults) sgh.a(parcelTransactAndReadException, DocumentResults.CREATOR);
                parcelTransactAndReadException.recycle();
                return documentResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplication[] getGlobalSearchApps(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(29, parcelObtainAndWriteInterfaceToken);
                GlobalSearchApplication[] globalSearchApplicationArr = (GlobalSearchApplication[]) parcelTransactAndReadException.createTypedArray(GlobalSearchApplication.CREATOR);
                parcelTransactAndReadException.recycle();
                return globalSearchApplicationArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(23, parcelObtainAndWriteInterfaceToken);
                PIMEUpdateResponse pIMEUpdateResponse = (PIMEUpdateResponse) sgh.a(parcelTransactAndReadException, PIMEUpdateResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return pIMEUpdateResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public NativeApiInfo getNativeApiInfo(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(34, parcelObtainAndWriteInterfaceToken);
                NativeApiInfo nativeApiInfo = (NativeApiInfo) sgh.a(parcelTransactAndReadException, NativeApiInfo.CREATOR);
                parcelTransactAndReadException.recycle();
                return nativeApiInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getPendingExperimentIds(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(32, parcelObtainAndWriteInterfaceToken);
                int[] iArrCreateIntArray = parcelTransactAndReadException.createIntArray();
                parcelTransactAndReadException.recycle();
                return iArrCreateIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, phraseAffinitySpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(24, parcelObtainAndWriteInterfaceToken);
                PhraseAffinityResponse phraseAffinityResponse = (PhraseAffinityResponse) sgh.a(parcelTransactAndReadException, PhraseAffinityResponse.CREATOR);
                parcelTransactAndReadException.recycle();
                return phraseAffinityResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public StorageStats getStorageStatistics(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(28, parcelObtainAndWriteInterfaceToken);
                StorageStats storageStats = (StorageStats) sgh.a(parcelTransactAndReadException, StorageStats.CREATOR);
                parcelTransactAndReadException.recycle();
                return storageStats;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplicationInfo[] getUniversalSearchableApps(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(13, parcelObtainAndWriteInterfaceToken);
                GlobalSearchApplicationInfo[] globalSearchApplicationInfoArr = (GlobalSearchApplicationInfo[]) parcelTransactAndReadException.createTypedArray(GlobalSearchApplicationInfo.CREATOR);
                parcelTransactAndReadException.recycle();
                return globalSearchApplicationInfoArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, querySpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(1, parcelObtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) sgh.a(parcelTransactAndReadException, SearchResults.CREATOR);
                parcelTransactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                parcelObtainAndWriteInterfaceToken.writeInt(i2);
                sgh.d(parcelObtainAndWriteInterfaceToken, globalSearchQuerySpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(10, parcelObtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) sgh.a(parcelTransactAndReadException, SearchResults.CREATOR);
                parcelTransactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, registerCorpusInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, registerCorpusInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(14, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerIME(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(20, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, globalSearchApplicationInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean reportResultClick(ResultClickInfo resultClickInfo, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, resultClickInfo);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(19, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeLong(j);
                sgh.d(parcelObtainAndWriteInterfaceToken, requestIndexingSpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(4, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean setExperimentIds(byte[] bArr, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeByteArray(bArr);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(30, parcelObtainAndWriteInterfaceToken);
                boolean zG = sgh.g(parcelTransactAndReadException);
                parcelTransactAndReadException.recycle();
                return zG;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void setIncludeInGlobalSearch(String str, boolean z, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                int i = sgh.a;
                parcelObtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(36, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                parcelObtainAndWriteInterfaceToken.writeInt(i);
                sgh.d(parcelObtainAndWriteInterfaceToken, suggestSpecification);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
                SuggestionResults suggestionResults = (SuggestionResults) sgh.a(parcelTransactAndReadException, SuggestionResults.CREATOR);
                parcelTransactAndReadException.recycle();
                return suggestionResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void triggerCompaction(ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unblockPackages(String[] strArr, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeStringArray(strArr);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle unregister(String str, String str2, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                parcelObtainAndWriteInterfaceToken.writeString(str2);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) sgh.a(parcelTransactAndReadException, Bundle.CREATOR);
                parcelTransactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterIME(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, parcelObtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterUniversalSearchableApp(String str, ApiMetadata apiMetadata) {
                Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                parcelObtainAndWriteInterfaceToken.writeString(str);
                sgh.d(parcelObtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, parcelObtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
        }

        public static IAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            return iInterfaceQueryLocalInterface instanceof IAppDataSearch ? (IAppDataSearch) iInterfaceQueryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String[] strArrCreateStringArray = parcel.createStringArray();
                    int i3 = parcel.readInt();
                    int i4 = parcel.readInt();
                    QuerySpecification querySpecification = (QuerySpecification) sgh.a(parcel, QuerySpecification.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults searchResultsQuery = query(string, string2, strArrCreateStringArray, i3, i4, querySpecification, apiMetadata);
                    parcel2.writeNoException();
                    sgh.e(parcel2, searchResultsQuery);
                    return true;
                case 2:
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String[] strArrCreateStringArray2 = parcel.createStringArray();
                    int i5 = parcel.readInt();
                    SuggestSpecification suggestSpecification = (SuggestSpecification) sgh.a(parcel, SuggestSpecification.CREATOR);
                    ApiMetadata apiMetadata2 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SuggestionResults suggestionResultsSuggest = suggest(string3, string4, strArrCreateStringArray2, i5, suggestSpecification, apiMetadata2);
                    parcel2.writeNoException();
                    sgh.e(parcel2, suggestionResultsSuggest);
                    return true;
                case 3:
                    String[] strArrCreateStringArray3 = parcel.createStringArray();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    QuerySpecification querySpecification2 = (QuerySpecification) sgh.a(parcel, QuerySpecification.CREATOR);
                    ApiMetadata apiMetadata3 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    DocumentResults documents = getDocuments(strArrCreateStringArray3, string5, string6, querySpecification2, apiMetadata3);
                    parcel2.writeNoException();
                    sgh.e(parcel2, documents);
                    return true;
                case 4:
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    long j = parcel.readLong();
                    RequestIndexingSpecification requestIndexingSpecification = (RequestIndexingSpecification) sgh.a(parcel, RequestIndexingSpecification.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zRequestIndexing = requestIndexing(string7, string8, j, requestIndexingSpecification, apiMetadata4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestIndexing ? 1 : 0);
                    return true;
                case 5:
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    CorpusStatus corpusStatus = getCorpusStatus(string9, string10, apiMetadata5);
                    parcel2.writeNoException();
                    sgh.e(parcel2, corpusStatus);
                    return true;
                case 6:
                    String string11 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] corpusNames = getCorpusNames(string11, apiMetadata6);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusNames);
                    return true;
                case 7:
                    String string12 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) sgh.a(parcel, RegisterCorpusInfo.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(string12, registerCorpusInfo, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundleUnregister = unregister(string13, string14, apiMetadata8);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleUnregister);
                    return true;
                case 9:
                    Bundle bundle = (Bundle) sgh.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle bundleDiagnostic = diagnostic(bundle, apiMetadata9);
                    parcel2.writeNoException();
                    sgh.e(parcel2, bundleDiagnostic);
                    return true;
                case 10:
                    String string15 = parcel.readString();
                    int i6 = parcel.readInt();
                    int i7 = parcel.readInt();
                    GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) sgh.a(parcel, GlobalSearchQuerySpecification.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults searchResultsQueryUniversal = queryUniversal(string15, i6, i7, globalSearchQuerySpecification, apiMetadata10);
                    parcel2.writeNoException();
                    sgh.e(parcel2, searchResultsQueryUniversal);
                    return true;
                case 11:
                    GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) sgh.a(parcel, GlobalSearchApplicationInfo.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerUniversalSearchableApp(globalSearchApplicationInfo, apiMetadata11);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    String string16 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterUniversalSearchableApp(string16, apiMetadata12);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    ApiMetadata apiMetadata13 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    GlobalSearchApplicationInfo[] universalSearchableApps = getUniversalSearchableApps(apiMetadata13);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(universalSearchableApps, 1);
                    return true;
                case 14:
                    String string17 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo2 = (RegisterCorpusInfo) sgh.a(parcel, RegisterCorpusInfo.CREATOR);
                    ApiMetadata apiMetadata14 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zRegisterCorpusInfo2 = registerCorpusInfo2(string17, registerCorpusInfo2, apiMetadata14);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterCorpusInfo2 ? 1 : 0);
                    return true;
                case 15:
                case 26:
                case 35:
                default:
                    return false;
                case 16:
                    String[] strArrCreateStringArray4 = parcel.createStringArray();
                    ApiMetadata apiMetadata15 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    blockPackages(strArrCreateStringArray4, apiMetadata15);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    String[] strArrCreateStringArray5 = parcel.createStringArray();
                    ApiMetadata apiMetadata16 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unblockPackages(strArrCreateStringArray5, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    ApiMetadata apiMetadata17 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    triggerCompaction(apiMetadata17);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    ResultClickInfo resultClickInfo = (ResultClickInfo) sgh.a(parcel, ResultClickInfo.CREATOR);
                    ApiMetadata apiMetadata18 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zReportResultClick = reportResultClick(resultClickInfo, apiMetadata18);
                    parcel2.writeNoException();
                    parcel2.writeInt(zReportResultClick ? 1 : 0);
                    return true;
                case 20:
                    String string18 = parcel.readString();
                    ApiMetadata apiMetadata19 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zRegisterIME = registerIME(string18, apiMetadata19);
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterIME ? 1 : 0);
                    return true;
                case 21:
                    String string19 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterIME(string19, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    String string20 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] corpusHandlesRegisteredForIME = getCorpusHandlesRegisteredForIME(string20, apiMetadata21);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusHandlesRegisteredForIME);
                    return true;
                case 23:
                    String string21 = parcel.readString();
                    int i8 = parcel.readInt();
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata22 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    PIMEUpdateResponse iMEUpdates = getIMEUpdates(string21, i8, bArrCreateByteArray, apiMetadata22);
                    parcel2.writeNoException();
                    sgh.e(parcel2, iMEUpdates);
                    return true;
                case 24:
                    String[] strArrCreateStringArray6 = parcel.createStringArray();
                    PhraseAffinitySpecification phraseAffinitySpecification = (PhraseAffinitySpecification) sgh.a(parcel, PhraseAffinitySpecification.CREATOR);
                    ApiMetadata apiMetadata23 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    PhraseAffinityResponse phraseAffinity = getPhraseAffinity(strArrCreateStringArray6, phraseAffinitySpecification, apiMetadata23);
                    parcel2.writeNoException();
                    sgh.e(parcel2, phraseAffinity);
                    return true;
                case 25:
                    String string22 = parcel.readString();
                    String string23 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    RegisterCorpusInfo corpusInfo = getCorpusInfo(string22, string23, apiMetadata24);
                    parcel2.writeNoException();
                    sgh.e(parcel2, corpusInfo);
                    return true;
                case 27:
                    String string24 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] allCorpusNames = getAllCorpusNames(string24, apiMetadata25);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(allCorpusNames);
                    return true;
                case 28:
                    ApiMetadata apiMetadata26 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    StorageStats storageStatistics = getStorageStatistics(apiMetadata26);
                    parcel2.writeNoException();
                    sgh.e(parcel2, storageStatistics);
                    return true;
                case 29:
                    ApiMetadata apiMetadata27 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    GlobalSearchApplication[] globalSearchApps = getGlobalSearchApps(apiMetadata27);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(globalSearchApps, 1);
                    return true;
                case 30:
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    boolean zG = sgh.g(parcel);
                    ApiMetadata apiMetadata28 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean experimentIds = setExperimentIds(bArrCreateByteArray2, zG, apiMetadata28);
                    parcel2.writeNoException();
                    parcel2.writeInt(experimentIds ? 1 : 0);
                    return true;
                case 31:
                    ApiMetadata apiMetadata29 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int[] currentExperimentIds = getCurrentExperimentIds(apiMetadata29);
                    parcel2.writeNoException();
                    parcel2.writeIntArray(currentExperimentIds);
                    return true;
                case 32:
                    ApiMetadata apiMetadata30 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int[] pendingExperimentIds = getPendingExperimentIds(apiMetadata30);
                    parcel2.writeNoException();
                    parcel2.writeIntArray(pendingExperimentIds);
                    return true;
                case 33:
                    ApiMetadata apiMetadata31 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean zClearUsageReportData = clearUsageReportData(apiMetadata31);
                    parcel2.writeNoException();
                    parcel2.writeInt(zClearUsageReportData ? 1 : 0);
                    return true;
                case 34:
                    ApiMetadata apiMetadata32 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    NativeApiInfo nativeApiInfo = getNativeApiInfo(apiMetadata32);
                    parcel2.writeNoException();
                    sgh.e(parcel2, nativeApiInfo);
                    return true;
                case 36:
                    String string25 = parcel.readString();
                    boolean zG2 = sgh.g(parcel);
                    ApiMetadata apiMetadata33 = (ApiMetadata) sgh.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setIncludeInGlobalSearch(string25, zG2, apiMetadata33);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void blockPackages(String[] strArr, ApiMetadata apiMetadata);

    boolean clearUsageReportData(ApiMetadata apiMetadata);

    Bundle diagnostic(Bundle bundle, ApiMetadata apiMetadata);

    String[] getAllCorpusNames(String str, ApiMetadata apiMetadata);

    String[] getCorpusHandlesRegisteredForIME(String str, ApiMetadata apiMetadata);

    RegisterCorpusInfo getCorpusInfo(String str, String str2, ApiMetadata apiMetadata);

    String[] getCorpusNames(String str, ApiMetadata apiMetadata);

    CorpusStatus getCorpusStatus(String str, String str2, ApiMetadata apiMetadata);

    int[] getCurrentExperimentIds(ApiMetadata apiMetadata);

    DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification, ApiMetadata apiMetadata);

    GlobalSearchApplication[] getGlobalSearchApps(ApiMetadata apiMetadata);

    PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr, ApiMetadata apiMetadata);

    NativeApiInfo getNativeApiInfo(ApiMetadata apiMetadata);

    int[] getPendingExperimentIds(ApiMetadata apiMetadata);

    PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification, ApiMetadata apiMetadata);

    StorageStats getStorageStatistics(ApiMetadata apiMetadata);

    GlobalSearchApplicationInfo[] getUniversalSearchableApps(ApiMetadata apiMetadata);

    SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, ApiMetadata apiMetadata);

    SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, ApiMetadata apiMetadata);

    void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata);

    boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata);

    boolean registerIME(String str, ApiMetadata apiMetadata);

    void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo, ApiMetadata apiMetadata);

    boolean reportResultClick(ResultClickInfo resultClickInfo, ApiMetadata apiMetadata);

    boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification, ApiMetadata apiMetadata);

    boolean setExperimentIds(byte[] bArr, boolean z, ApiMetadata apiMetadata);

    void setIncludeInGlobalSearch(String str, boolean z, ApiMetadata apiMetadata);

    SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, ApiMetadata apiMetadata);

    void triggerCompaction(ApiMetadata apiMetadata);

    void unblockPackages(String[] strArr, ApiMetadata apiMetadata);

    Bundle unregister(String str, String str2, ApiMetadata apiMetadata);

    void unregisterIME(String str, ApiMetadata apiMetadata);

    void unregisterUniversalSearchableApp(String str, ApiMetadata apiMetadata);
}
