// This is a "stub" file.  It's a little start on your solution.
// It's not a complete solution though; you have to write some code.

// Package gigasecond implements a simple addition to a datetime
package gigasecond

// import path for the time package from the standard library
import "time"

// AddGigasecond adds a gigasecond (10^9 seconds) to any datetime input
func AddGigasecond(t time.Time) time.Time {
	return t.Add(1e9 * time.Second)
}
