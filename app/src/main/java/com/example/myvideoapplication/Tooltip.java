package com.example.myvideoapplication;

public interface Tooltip {

    // COMMAND TEST
    String COMMAND_TEST_TOOLTIP_TEXT = "Enter an FFmpeg command without 'ffmpeg' at the beginning and click one of the RUN buttons";

    // VIDEO TEST
    String VIDEO_TEST_TOOLTIP_TEXT = "Select a video codec and press ENCODE button";

    // HTTPS TEST
    String HTTPS_TEST_TOOLTIP_TEXT = "Enter the https url of a media file and click the button";

    // AUDIO TEST
    String AUDIO_TEST_TOOLTIP_TEXT = "Select an audio codec and press ENCODE button";

    // SUBTITLE TEST
    String SUBTITLE_TEST_TOOLTIP_TEXT = "Click the button to burn subtitles. Created video will play inside the frame below";

    // VID.STAB TEST
    String VIDSTAB_TEST_TOOLTIP_TEXT = "Click the button to stabilize video. Original video will play above and stabilized video will play below";

    // PIPE TEST
    String PIPE_TEST_TOOLTIP_TEXT = "Click the button to create a video using pipe redirection. Created video will play inside the frame below";

    // CONCURRENT EXECUTION TEST
    String CONCURRENT_EXECUTION_TEST_TOOLTIP_TEXT = " Use ENCODE nad CANCEL buttons to start/stop multiple execution";

}
